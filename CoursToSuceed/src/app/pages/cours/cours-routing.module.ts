import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CoursDetailComponent } from './cours-detail/cours-detail.component';
import { CoursListComponent } from './cours-list/cours-list.component';
import { CoursComponent } from './cours.component';

const routes: Routes = [

  {path: 'cours', 
  children: [
    {path:'', component: CoursListComponent},
    {path:':id', component:CoursDetailComponent}
  ]},
  
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class CoursRoutingModule { }
