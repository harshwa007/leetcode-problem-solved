#include <iostream>
#include <vector>
using namespace std;

int partition(vector<int>& arr, int low, int high)
{
    //Consider last element as pivot
    int pivot = arr[high];
    //sets i index to be low -1
    int i = low-1;
    for(int j=low;j<=high-1;++j)
    {
        //If found smaller element than pivot then increment i and swap with found element and ith element
        if(arr[j]<pivot)
        {
            ++i;
            std::swap(arr[i],arr[j]);
        }
    }
    //Finally just swap next element of ith with pivot element
    std::swap(arr[i+1],arr[high]);
    //return current pivot element index
    return i+1;
}
void QuickSort(vector<int>& arr, int low, int high)
{
    if(low<high)
    {
        int pivot = partition(arr,low,high);
        QuickSort(arr,low,pivot-1);
        QuickSort(arr,pivot+1,high);
    }
}
int main()
{
    vector<int> arr = {10, 7, 8, 9, 1, 5};
    int n = arr.size();
    QuickSort(arr, 0, n - 1);
  
    for (int i = 0; i < n; i++) {
        cout << arr[i] << " ";
    }
    return 0;
}
