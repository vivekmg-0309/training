import { Component, OnInit } from '@angular/core';
import { TaskService } from '../service/task.service';
import {Task} from 'src/app/model/task.model';
import  { ActivatedRoute, Router } from '@angular/router';

@Component({

  selector: 'app-setpriority-task',

  templateUrl: './update-task.component.html',


})

export class UpdateTaskComponent implements OnInit {
  tasks:any;
  taskId!:number;
  priority!:string;
  task!:Task;
 
  constructor(private route:ActivatedRoute, private router:Router,
    private taskService:TaskService) { }
    ngOnInit(): void {
    }
  
    updatePriority():void{
      this.taskService.updatePriority(this.taskId, this.priority).
      subscribe(data=>console.log(data), error=>console.log(error));
      this.task = new Task();
      this.gotoList();
    }
  
    onSubmit(){
      this.updatePriority();
    }
    gotoList() {
      this.router.navigate(['updateprio'])
     
    }
  
  }
  
  


  /*
  pri():void{
    this.updated=true;
    this.taskService.pri(this.taskId, this.priority).

    subscribe(data=>console.log(data), error=>console.log(error))
    alert("Priroty is updated");



    this.task = new Task();

    this.gotoList();}

   onSubmit(){

    this.pri();

    
  
  }

  gotoList() {

    this.router.navigate(['updateprio'])

  }

  */

