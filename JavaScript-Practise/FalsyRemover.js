function bouncer(arr){
  let resultarr = [];
  for(let i = 0 ; i<arr.length;i++){
    if(arr[i]!== " " && arr[i]!== "" && arr[i]!== false && arr[i]!== null && arr[i]!== 0 && arr[i] == arr[i] && arr[i]!== undefined){
    resultarr.push(arr[i]);
  }
  }
  return resultarr;
}
console.log(bouncer([false, null, 0, NaN, undefined, ""]))