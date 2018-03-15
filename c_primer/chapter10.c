#include <c_primer.h>
#include <string.h>
#include <stdio.h>

int copy_arr(double target1[], double source[], int len){
    int index;
    for(index=0; index < len; index++){
        target1[index] = source[index];
    }
    return 1;
}

//数组作为形式参数，是按值传递数组的头一个元素的地址，
//对这个地址进行解引用后进行的操作会改变数组
//传递指针也一样，只能对这个指针进行解引用然后进行操作才能改变原值
//指针也是变量，存的是另一个变量的地址
int copy_ptr(double target2[], double source[], int len){
    int index;
    for(index=0; index < len; index++){
        *target2++ = *source++;
    }

    return 1;
}

int copy_ptrs(double target1[], double source[], double * lastptr){
    while(source <= lastptr){
        *target1++ = *source++;
    }

}
