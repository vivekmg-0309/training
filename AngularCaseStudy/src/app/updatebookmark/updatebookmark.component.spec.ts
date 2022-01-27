import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UpdatebookmarkComponent } from './updatebookmark.component';

describe('UpdatebookmarkComponent', () => {
  let component: UpdatebookmarkComponent;
  let fixture: ComponentFixture<UpdatebookmarkComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ UpdatebookmarkComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(UpdatebookmarkComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
