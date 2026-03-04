/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
#include<stdio.h>
#include<conio.h>
#include<stdlib.h>

int* twoSum(int* nums, int numsSize, int target, int* returnSize) {
    int i, a, b;
    int* result = (int*)malloc(2*sizeof(int));
    for (i = 0; i < numsSize; i++) {
        if (i == numsSize - 1) {
            a = i;
            b = 0;
            if (target == nums[a] + nums[b]) {
                result[0] =a;
                result[1] = b;
                *returnSize = 2;
                return result;
            }
        } else {
            a = i;
            b = i + 1;
            if (target == nums[a] + nums[b]) {
                result[0] =a;
                result[1] = b; 
                *returnSize = 2;
                return result;
            }
        }
    }
}

int main() {
    int nums[] = {2, 7, 11, 15};
   int  numsSize = sizeof(nums) / sizeof(nums[0]);
    int returnSize, target=178;

    int *result = twoSum(nums, numsSize, target, &returnSize);
    if(returnSize == 2)
    printf("[%d,%d]", result[0], result[1]);
    else 
    printf("sum not found");
    free(result);
    return 0;
}