import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Task } from '../model/task.model';
import { TaskService } from '../service/task.service';

@Component({
  selector: 'app-updatebookmark',
  templateUrl: './updatebookmark.component.html',
  styleUrls: ['./updatebookmark.component.css']
})
export class UpdatebookmarkComponent implements OnInit {
  tasks:any;
  taskId!:number;
  bookmark!:string;
  task!:Task;
  constructor(private route:ActivatedRoute, private router:Router,
    private taskService:TaskService) { }
    ngOnInit(): void {
    }
  
    updateBook():void{
      this.taskService.updateBook(this.taskId, this.bookmark).
      subscribe(data=>console.log(data), error=>console.log(error));
      this.task = new Task();
      this.gotoList();
    }
  
    onSubmit(){
      this.updateBook();
    }
    gotoList() {
      this.router.navigate(['updatebookmark'])
     
    }
  
  }