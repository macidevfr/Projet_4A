import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BuilderDetailComponent } from './builder-detail/builder-detail.component';
import { BuilderListComponent } from './builder-list/builder-list.component';
import { BuildersComponent } from './builders.component';

const routes: Routes = [
  {path: 'builders',
  children: [
    {path: '', component: BuilderListComponent},
    {path: 'id', component: BuilderDetailComponent}
  ]}
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class BuildersRoutingModule { }
