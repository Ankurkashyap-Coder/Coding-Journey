function getAverage(arr){
let average;
let sum = 0;
for(let i=0 ; i<arr.length;i++){
sum+=  arr[i];
}
average = sum / (arr.length);
return average;
}

function getGrade(score){
if(score === 100){
return ("A+");
}
if(score >= 90 && score<=99){
return "A";
}
if(score >= 80 && score <= 89){
  return "B";

}
if(score>=70 && score<=79){
  return "C";
}
if(score >= 60 && score<=69){
  return "D";
}
if(score>=0 && score<=59){
  return "F";
}
}

function hasPassingGrade(score){
if(getGrade(score) == "A+" || getGrade(score) == "A" || getGrade(score) == "B" || getGrade(score) == "C" || getGrade(score) == "D" || getGrade(score) == "E" ){
return true;
}
if(getGrade(score) == "F"){
  return false;
}
}

function studentMsg(arr, score){
  const average = getAverage(arr);
  const grade = getGrade(score);
  if(hasPassingGrade(score)){
    return (`Class average: ${average}. Your grade: ${grade}. You passed the course.`)
  }
  else{
    return (`Class average: ${average}. Your grade: ${grade}. You failed the course.`)
  }
}

