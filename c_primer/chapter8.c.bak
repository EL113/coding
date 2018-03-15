#include <stdio.h>
#include <c_primer.h>
#include <ctype.h>
// 需要引入这个头文件才能引用true和false，不然需要自己定义
#include <stdbool.h>

void chapter8_1(){
    char value;
    int count = 0;
    while((value = getchar()) != '&'){
        count++;
    }
    printf("count:%d", count);
}

void chapter8_4(){
    int wordCount = 0;
    bool inword = false;
    char value;

    while((value = getchar()) != '&'){
        if(isspace(value) || ispunct(value)){
            inword = false;
        } else if (!inword){
            inword = true;
            wordCount++;
        }
    }
    printf("there are %d words", wordCount);
}

