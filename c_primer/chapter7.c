#include <stdio.h>
#include <c_primer.h>
//该头文件有处理很多处理单个字符或数字的函数
#include <ctype.h>

void chapter7_1(){
    char value;
    int spaceCount = 0;
    int enterCount = 0;
    int otherCount = 0;

    //getchar函数也是用enter刷新缓冲区，但是会保留回车符在缓冲区。
    while((value = getchar()) != '#'){
        if(value == ' '){
            spaceCount++;
            continue;
        }
        if(value == '\n'){
            enterCount++;
            continue;
        }
        otherCount++;
    }
    printf("spaceCount: %d, enterCount: %d, otherCount: %d.", spaceCount, enterCount, otherCount);
}

//scanf同样是在enter时才刷新缓冲区给程序处理。
void chapter7_2(){
    int doubleCount = 0;
    int singleCount = 0;
    int totalCount = 0;
    int totalValue = 0;
    double average = 0;
    int value = -1;

    printf("enter integers, separate with space, end with 0:\n");
    while(value != 0){
        scanf("%d", &value);
        if(value == 0){
            continue;
        }
        if(value % 2 == 0){
            doubleCount++;
        }else{
            singleCount++;
        }
        totalCount++;
        totalValue += value;
    }
    average = ((double)totalValue)/totalCount;
    printf("single count: %d, double count: %d, average: %lf", singleCount, doubleCount, average);
}
