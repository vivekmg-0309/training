import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Task } from '../model/task.model';
import { TaskService } from '../service/task.service';

@Component({
  selector: 'app-updatenotes',
  templateUrl: './updatenotes.component.html',
  styleUrls: ['./updatenotes.component.css']
})
export class UpdatenotesComponent implements OnInit {

  tasks:any;
  
  taskId!:number;
  bookmark!:string;



  task!:Task;

  updatednotes=false;
  constructor(private route:ActivatedRoute, private router:Router,

    private taskService:TaskService) { }



  ngOnInit(): void {

  }

  updateNotes():void{
    this.updatednotes=true;
    this.taskService.updateNote(this.taskId, this.bookmark).

    subscribe(data=>console.log(data), error=>console.log(error))
    alert("Notes  is updated");



    this.task = new Task();

    this.gotoList();}

   onSubmit(){

    this.updateNotes();

    
  
  }

  gotoList() {

    this.router.navigate(['updatenote'])

  }}