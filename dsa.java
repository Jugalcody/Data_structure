import java.util.Scanner;

public class Main{


//Main function
public static void main(String[] args){
Scanner sc=new Scanner(System.in);

System.out.print("\nData structures.......\n");

int ch;
int n=0;
while(n!=1){
System.out.print("\n\nSelect your choice -------\n\n");
System.out.print("1 - Array\n2 - Stack using array\n3 - Queues using array\n4 - Linked list\n5 - exit");
System.out.print("\n\nEnter your choice : ");
ch=sc.nextInt();
if(ch==5){
n=1;
}
if(ch==1){


array a=new array();

a.create();
a.display();
}
else if(ch==3){
//queue
queue q=new queue();
int t;
System.out.print("\nEnter number of elements : ");
t=sc.nextInt();
for (int o=0;o<t;o++){
q.enqueue();
}
System.out.print("\nQueue is ");
q.display();
}
else if(ch==4){

link l=new link();
l.create();
System.out.print("\n");
l.display();
}
else if(ch==2){

stack ss=new stack();
int tt;
System.out.print("\nEnter number of elements : ");
tt=sc.nextInt();
for (int oo=0;oo<tt;oo++){
ss.push();
} 
System.out.print("\n\nStack is ");
ss.display();
}


}}}




//Array

class array{
int arr[]=new int[50];

int n;


void create(){
Scanner in=new Scanner(System.in);
System.out.print("Enter number of elements : ");
n=in.nextInt();
for(int i=0;i<n;i++){
System.out.print("Enter a num : ");
arr[i]=in.nextInt();
}}

void display(){
System.out.print("\nArray is : ");
for(int j=0;j<n;j++){
System.out.print(arr[j]+" ");
}}
} 



//Stack

class stack{

int arr2[]=new int[50];
int top=-1;
Scanner sc=new Scanner(System.in);
void push(){
     System.out.print("Enter an element : ");
     int e=sc.nextInt();
    top=top+1;
    arr2[top]=e;
       }
void pop(){
if(top!=-1){
top=top-1;
}
else{
System.out.println("Empty stack");}
}
void display(){

for(int i=top;i>=0;i--){
System.out.print(arr2[i]+" ");
}
}
} 


//Queue


class queue{
Scanner sc=new Scanner(System.in);
int front=-1,rear=-1;
int arrq[]=new int[50];

void enqueue(){
if(rear==-1 || front==-1){
rear=rear+1;
front=front+1;

}

else{
rear=rear+1;
}
 System.out.print("Enter an element : ");
     int e=sc.nextInt();
 arrq[rear]=e;
 }
 
void dequeue(){

if (rear==0 || front==0){

         front=front-1;
         rear=rear-1;
         
           }
           else if(rear==-1 || front==-1){
           System.out.print("\nEmpty stack");
           }
           else{
           rear=rear-1;
           }
           }
void display(){

for(int i=front;i<=rear;i++){

System.out.print(arrq[i]+" ");
}}
}


//Linked list
           
class link{          
class node{
int data;
node next;
}

Scanner sc=new Scanner(System.in);
//node ll=new node();
node head=null;
void create(){
 
           
      int a;
      System.out.print("\nEnter number of nodes : ");
      a=sc.nextInt();
      for(int i=0; i<a;i++){
      System.out.print("Enter elements : ");
      int data=sc.nextInt();
      node newnode=new node();
      newnode.data=data;
      if (head==null){
        head=newnode;
        }
        else if(head.next==null){
        head.next=newnode;
        }
        else{
        node temp=head;
        while (temp.next!=null){
        temp=temp.next;
        }
        temp.next=newnode;
        }}}


void display(){

node ptr=head;
while(ptr!=null){
System.out.print(ptr.data+"->");
ptr=ptr.next;
}
System.out.print("Null");
}
}



        
        

