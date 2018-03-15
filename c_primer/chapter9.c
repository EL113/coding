#include <string.h>
#include <c_primer.h>
#include <stdio.h>

char* chline(char* instring, int i, int j){
    if(i < 0 || j > 9){
        printf("number is out of range\n");
    }

    int count;
    char outstring[10];
    for(count = i; count <=j; count++){
        outstring[count] = instring[count];
    }

    return outstring;
}
