const questions=[
  {
    category: "Array Methods",
    question: "Which JavaScript array method is used to add elements to the end of an array?",
    choices: ["pop()", "unshift()", "push()"],
    answer: "push()"
  },
  {
    category: "Object Property Access",
    question: "How do you access an object property when the key name is stored in a variable?",
    choices: ["car.propName", "car[propName]", "car.color"],
    answer: "car[propName]"
  },
  {
    category: "Array Iteration",
    question: "Which array method creates a new array by transforming every element?",
    choices: ["forEach()", "filter()", "map()"],
    answer: "map()"
  },
  {
    category: "Object Methods",
    question: "Which method returns an array of a given object's own property names?",
    choices: ["Object.values()", "Object.keys()", "Object.entries()"],
    answer: "Object.keys()"
  },
  {
    category: "Array Mutability",
    question: "Which of the following array methods modifies the original array?",
    choices: ["filter()", "slice()", "splice()"],
    answer: "splice()"
  }
];

function getRandomQuestion(arrQuestion){
const index = Math.floor(Math.random() * arrQuestion.length);
return arrQuestion[index];
}
function getRandomComputerChoice(choicesArray) {
  const index = Math.floor(Math.random() * choicesArray.length);
  return choicesArray[index];
}
 function getResults(question, choice){
    if(choice === question.answer){
       return "The computer's choice is correct!";
    }
    else {
      return "The computer's choice is wrong. The correct answer is: " + question.answer;
    }
 }

