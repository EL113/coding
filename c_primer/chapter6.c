#include <c_primer.h>
#include <stdio.h>

void chapter6_1(){
    char value_array[26];
    char value = 'a';
    int index;

    //printf函数不能将非char类型的数据自动转型，只能使用占位符来转型
    for(index = 0; index < 26; index++){
        value_array[index] = value;
        value++;
        printf("%c",value_array[index]);
    }
}

void chapter6_3(){
    for(int i = 0; i <= 6; i++){
        for(int j = 0; j < i; j++){
            printf("%c", 'f'-j);
        }
        printf("\n");
    }
}

void chapter6_17(){
    double startValue = 100;
    double yearTake = 10;
    int count = 0;

    while(startValue > 0){
        startValue = startValue * 1.08 - yearTake;
        count++;
    }

    printf("his money will run out after %d years\n", count);
}

void chapter6_18(){
    int start = 5;
    int count = 1;

    while(start < 150){
        start = (start - count) * 2;

        if(start > 150){
            return;
        }

        printf("he has %d friends in %dth week\n", start, count);
        count++;
    }
}

