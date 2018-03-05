#include <stdio.h>
#include <c_primer.h>
//��ͷ�ļ��д���ܶദ�����ַ������ֵĺ���
#include <ctype.h>

void chapter7_1(){
    char value;
    int spaceCount = 0;
    int enterCount = 0;
    int otherCount = 0;

    //getchar����Ҳ����enterˢ�»����������ǻᱣ���س����ڻ�������
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

//scanfͬ������enterʱ��ˢ�»�������������
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
