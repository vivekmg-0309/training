import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CreateTaskComponent } from './task/create-task/create-task.component';
import { TaskListComponent } from './task/task-list/task-list.component';
import { SearchStatusComponent } from './search-status/search-status.component';
import { UpdateTaskComponent } from './update-task/update-task.component';
import { Login } from './login';
import { UpdatebookmarkComponent } from './updatebookmark/updatebookmark.component';
import { UpdatenotesComponent } from './updatenotes/updatenotes.component';
const routes: Routes = [
  {path:'',redirectTo:'Login',pathMatch:'full' },
  {path:'add', component:CreateTaskComponent},
  {path:'tasks', component:TaskListComponent},
  {path:'Login',component:Login},
  { path:'search', component:SearchStatusComponent},
  { path:'updatePriority', component:UpdateTaskComponent},
  { path:'updateBook', component:UpdatebookmarkComponent},
  { path:'updatenote', component:UpdatenotesComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
