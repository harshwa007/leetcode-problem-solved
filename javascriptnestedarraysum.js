function sumNestedArray(arr)
{
    let total=0;
    for(let i=0;i<arr.length;i++)
    {
        if(Array.isArray(arr[i]))
        {
            total+=sumNestedArray(arr[i])
        }
        else
        { 
         const el = arr[i]; 
         if(+el){
         total += +el;
         }
            /*
            if(!isNaN(arr[i]))
            {
                     total+=arr[i];             
            }
             */
        }
    }
    
    return total;
}
const nestedArray=[1,[2,[3,4]],5,'7',[6,7]];
const result= sumNestedArray(nestedArray);
console.log(result);
