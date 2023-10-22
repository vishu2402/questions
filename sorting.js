function descendingInsertionSort(arr) {
    for (let i = 1; i < arr.length; i++) {
      let currentElement = arr[i];
      let j = i - 1;
  
      while (j >= 0 && arr[j] < currentElement) {
        arr[j + 1] = arr[j];
        j--;
      }
  
      arr[j + 1] = currentElement;
    }
  
    return arr;
  }
  
  const unsortedArray = [5, 2, 1, 2, 8];
  const sortedArray = descendingInsertionSort(unsortedArray);
  console.log(sortedArray);
  