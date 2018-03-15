#include <string.h>
#include <c_primer.h>
#include <stdio.h>

int chline(char * instring, char outstring[], int i, int j){
    int strlength = strlen(instring);
    if(i > strlength || j > strlength || i > j){
        printf("out of boundary error\n");
    }

    int count;
    for(count = i; count <=j; count++){
        //不能给没有赋过值的指针解引用复制，只能赋地址给指针
        *outstring = *(instring+count);
        outstring++;
    }

    return 1;
}
