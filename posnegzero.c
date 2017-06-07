#include<stdio.h>
#include<conio.h>
int main()
{
int num;
printf("enter the num");
scanf("%d",&num);
if(num<0)
    {printf("enter num is the negative number");
}
else if(num>0)
{printf("enter num  is the positive number");
}
else
{printf("enter num is zero ");
}
return 0;
}
