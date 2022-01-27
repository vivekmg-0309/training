import { Component, OnInit } from '@angular/core';
import { TaskService } from '../service/task.service';
import { ActivatedRoute, Router } from '@angular/router';


@Component({
  selector: 'app-search-status',
  templateUrl: './search-status.component.html',
  styleUrls: ['./search-status.component.css']
})
export class SearchStatusComponent implements OnInit {
  task:any;
  task_ID!:number;
  status !: string;
  
  constructor(private taskService:TaskService, private router:Router)  { }

  ngOnInit() {
    
      
  }

  statuscheck(){
  
    this.taskService.searchByStatus(this.status).subscribe(

      data => {

        this.task = data;

        console.log(this.task);

      },

      error => {

        console.log(error);

      });

    }

    searchStatus(id: number){
      this.router.navigate(['search']);
    }
  
}

