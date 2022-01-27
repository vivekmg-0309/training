import { Injectable } from '@angular/core';
import {ApiResponse} from 'src/app/model/api.response';
import {Task} from 'src/app/model/task.model';
import {HttpClient} from '@angular/common/http';
import {Observable} from "rxjs/index";
import { userreg } from '../postdataObj1';
import { map } from 'jquery';
import { user } from '../user';

@Injectable({
  providedIn: 'root'
})
export class TaskService {

  constructor(private http:HttpClient) { }
  baseUrl:string='http://localhost:8090/createaddtask';
  baseUrl1:string='http://localhost:8090/restgetAlltask';
  baseUrl3: string='http://localhost:8090/createuser';
 // baseUrl4:string='http://localhost:8090/restpriority';

  getTasks():Observable<any>{
    return this.http.get<ApiResponse>(this.baseUrl1);
  }
  getTaskById(taskId:number):Observable<any>{
    return this.http.get(this.baseUrl+taskId);
  }
  createTask(task:Task):Observable<ApiResponse>{
    return this.http.post<ApiResponse>(this.baseUrl,task);
  }
 
  deleteTask(id:number):Observable<any>{
    return this.http.delete<any>(this.baseUrl1+id);
  }
  validate(userName: string,password:string): Observable<any> {

    return this.http.get(`http://localhost:8090/user/${userName}/${password}`);

  }
  
searchByStatus(status:string): Observable<any> {

  return this.http.get(`http://localhost:8090/status/${status}`);

}
    createUser(user:userreg):Observable<ApiResponse>{
      return this.http.post<ApiResponse>(this.baseUrl3,user);
    }

    updateNote(taskId:number,notes:string):Observable<Object>{
      return this.http.put(`http://localhost:8090/restbookmark/${taskId}/${notes}`,Task);
     
      }

      updatePriority(taskId:number,priority:string):Observable<Object>{
        return this.http.get(`http://localhost:8090/assignpriority/${taskId}/${priority}`);
      }
      
  updateBook(taskId:number,bookmark:string):Observable<Object>{
    return this.http.get(`http://localhost:8090/assigbookmark/${taskId}/${bookmark}`);
   
    }

  }



