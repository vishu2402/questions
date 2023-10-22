function reverseWordsInSentence(sentence) {
    let reversedWords = [];
    let currentWord = '';
    
    for (let i = 0; i < sentence.length; i++) {
        const char = sentence[i];
        
        if (char === ' ') {

            reversedWords.push(reverseWord(currentWord));
            currentWord = '';
        } else {
            currentWord += char;
        }
    }
    
    reversedWords.push(reverseWord(currentWord));

    const reversedSentence = reversedWords.join(' ');

    return reversedSentence;
}

function reverseWord(word) {

    const reversedWord = word.split('').reverse().join('');
    return reversedWord;
}

const inputSentence = "Hakuna Matata";
const reversedSentence = reverseWordsInSentence(inputSentence);
console.log(reversedSentence);
