let lunches=[];

function addLunchToEnd(arr, shift){
  arr.push(shift);
  console.log(`${shift} added to the end of the lunch menu.`);
  return arr;
}
addLunchToEnd(lunches,"Tacos");
const result=addLunchToEnd(["Pizza", "Tacos"], "Burger");
console.log(result);

function addLunchToStart(arr, string){
arr.unshift(string);
console.log(`${string} added to the start of the lunch menu.`);
return arr;
}

function removeLastLunch(arr){
  if(arr.length=='0'){
    console.log("No lunches to remove.")
  } else {
  let popelement=arr.pop();
  console.log(`${popelement} removed from the end of the lunch menu.`);
  return arr;
  }
}

function removeFirstLunch(arr){
  if(arr.length=='0'){
    console.log("No lunches to remove.")
  } else {
  let shift=arr.shift();
  console.log(`${shift} removed from the start of the lunch menu.`);
  return arr;
  }
}

function getRandomLunch(arr){
  if(arr.length=== 0){
    console.log("No lunches available.")
  } else {
  let random= Math.floor(Math.random() * arr.length);
  let randomNum= arr[random];
  console.log(`Randomly selected lunch: ${randomNum}`);
  
  }
}

function showLunchMenu(arr){
  if(arr.length=='0'){
    console.log("The menu is empty.")
  } else {
  
  console.log(`Menu items: ${arr.join(", ")}`);
}
}
showLunchMenu(["Greens", "Corns", "Beans"]);
showLunchMenu(["Pizza", "Burger", "Fries", "Salad"]);