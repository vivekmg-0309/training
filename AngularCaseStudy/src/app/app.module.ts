import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CreateTaskComponent } from './task/create-task/create-task.component';
import { TaskListComponent } from './task/task-list/task-list.component';
import {TaskService} from './service/task.service';
import {HttpClientModule} from '@angular/common/http';
import {FormsModule} from '@angular/forms';
import { DataTablesModule } from 'angular-datatables';
import { Login } from './login';
import { SearchStatusComponent } from './search-status/search-status.component';
import { UpdateTaskComponent } from './update-task/update-task.component';
import { UpdatebookmarkComponent } from './updatebookmark/updatebookmark.component';
import { UpdatenotesComponent } from './updatenotes/updatenotes.component';
@NgModule({
  declarations: [
    AppComponent,
    CreateTaskComponent,
    TaskListComponent,
    Login,
    SearchStatusComponent,
    UpdateTaskComponent,
    UpdatebookmarkComponent,
    UpdatenotesComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    DataTablesModule

  ],
  providers: [TaskService],
  bootstrap: [AppComponent]
})
export class AppModule { }
