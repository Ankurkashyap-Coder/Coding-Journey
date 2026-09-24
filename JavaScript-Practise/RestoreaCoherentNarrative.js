const shuffledFragments = [
  { id: 15, text: "and, after a time, passed the place where the Hare was sleeping." },
  { id: 12, text: "he lay down beside the course to take a nap" },
  ,
  { id: 11, text: "and to make the Tortoise feel very deeply how ridiculous it was for him to try a race with a Hare," },
  { id: 7, text: "but for the fun of the thing he agreed." },
  { id: 19, text: "The Hare now ran his swiftest," },
  ,
  { id: 1, text: "A Hare was making fun of the Tortoise one day for being so slow." },
  { id: 14, text: "The Tortoise meanwhile kept going slowly but steadily," },
  { id: 9, text: "marked the distance and started the runners off." },
  ,
  { id: 5, text: "I'll run you a race and prove it.\"" },
  { id: 17, text: "and when at last he did wake up," },
  { id: 2, text: '"Do you ever get anywhere?" he asked with a mocking laugh.' },
  { id: 12, text: "he lay down beside the course to take a nap" },
  ,
  { id: 8, text: "So the Fox, who had consented to act as judge," },
  { id: 20, text: "but he could not overtake the Tortoise in time." },
  { id: 5, text: "I'll run you a race and prove it.\"" },
  { id: 6, text: "The Hare was much amused at the idea of running a race with the Tortoise," },
  ,
  { id: 13, text: "until the Tortoise should catch up." },
  { id: 10, text: "The Hare was soon far out of sight," },
  { id: 12, text: "he lay down beside the course to take a nap" },
  { id: 18, text: "the Tortoise was near the goal." },
];
const compactedShuffledFragments = compactFragments(shuffledFragments);
const sortedFragments = sortFragments(compactedShuffledFragments);
const dedupedFragments = dedupeFragments(sortedFragments);
const filledFragments = fillMissingFragments(dedupedFragments);

console.log(assembleStory(filledFragments));

function compactFragments(arr){
  let length = arr.length;
  let ischange = false;
  let result = [];
  let count = 0;
   for(let i=0; i<length;i++){
    if(arr[i] !== undefined){
    result.push(arr[i]);
    }
    else{
      ischange = true;
    }
   }
    if(ischange){
      console.log("[COMPACTED]");
    }
    
      return result;
     
}


function sortFragments(arr) {
  const result = [...arr]; 
  const len = result.length;
  
  for (let i = 0; i < len; i++) {
    for (let j = 0; j < len - 1 - i; j++) {
      if (result[j].id > result[j + 1].id) {
        
        const temp = result[j];
        result[j] = result[j + 1];
        result[j + 1] = temp;
      }
    }
  }
  return result;
}

function dedupeFragments(arr) {
  const result = [];
  const seenIds = new Set();
  
  for (let i = 0; i < arr.length; i++) {
    const currentItem = arr[i];
    if (seenIds.has(currentItem.id)) {
      console.log(`[DEDUPED] Duplicate ID found: ${currentItem.id}`);
    } else {
      seenIds.add(currentItem.id);
      result.push(currentItem);
    }
  }
  return result;
}

function fillMissingFragments(arr) {
  if (arr.length === 0) return [];
  const result = [];
  
  
  let expectedId = arr[0].id;
  
  for (let i = 0; i < arr.length; i++) {
    
    while (expectedId < arr[i].id) {
      result.push({ id: expectedId, text: "[...]" });
      console.log(`[FILLED] Missing slot filled at ID: ${expectedId}`);
      expectedId++;
    }
    result.push(arr[i]);
    expectedId++;
  }
  return result;
}
function assembleStory(arr) {
  const textFragments = [];
  for (let i = 0; i < arr.length; i++) {
    textFragments.push(arr[i].text);
  }
  return textFragments.join("\n");
}