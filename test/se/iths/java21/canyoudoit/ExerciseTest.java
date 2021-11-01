package se.iths.java21.canyoudoit;

import org.assertj.core.util.Strings;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

public class ExerciseTest {

    @ParameterizedTest
    @ValueSource(strings={"abba","racecar","02022020","step on no pets",
            "never odd or even","top spot","Murder for a jar of red rum",
            "Cigar? Toss it in a can. It is so tragic.","Borrow or rob?"})
    void givenWordThatIsPalindromeShouldReturnTrue(String text) {
        //https://www.grammarly.com/blog/16-surprisingly-funny-palindromes/
        assertThat(Exercise.palindrome(text)).isTrue();
    }

    @ParameterizedTest
    @ValueSource(strings={"no","not palindrome","test"})
    void givenWordThatIsNotPalindromeReturnFalse(String text) {
        assertThat(Exercise.palindrome(text)).isFalse();
    }

    @Test
    void givenTwoWordsThatAreAnagramsShouldReturnTrue() {
        //Anagram, Write a function that takes two words as an argument and returns true if they are anagrams (contain the exact same letters) and false otherwise.
        assertThat(Exercise.anagram("anagram","magarna")).isTrue();
        assertThat(Exercise.anagram("arc","car")).isTrue();
        assertThat(Exercise.anagram("bored","robed")).isTrue();
        assertThat(Exercise.anagram("debit card","bad credit")).isTrue();
        assertThat(Exercise.anagram("A gentleman","Elegant man")).isTrue();
    }

    //Reversing a list.

    //Almost valid Palindrome
    //Given a string s, return true if the string can be palindrome
    // after deleting at most one character from it.
    //"abca","racecars","2121"

    //Array/List rotation
    //base = [1, 2, 3, 4, 5]
    //right_rotation = [5, 1, 2, 3, 4]
    //left_rotation = [2, 3, 4, 5, 1]
    //Rotating Multiple Positions?

    //Find longest word in text
    //Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas luctus ipsum et facilisis dignissim. Duis mattis enim urna. Quisque orci nunc, vulputate id accumsan nec, imperdiet sit amet sem. Integer consequat nibh vel mattis elementum. Nam est elit, sodales vitae augue nec, consequat porttitor nibh. Aliquam ut risus vehicula, egestas ligula sed, egestas neque. Fusce hendrerit vel risus in molestie. Morbi molestie eleifend odio vel ullamcorper. Donec at odio libero. Quisque vulputate nisl nisi, ut convallis lorem vulputate et. Aenean pretium eu tellus a dapibus. Ut id sem vulputate, finibus erat quis, vestibulum enim. Donec commodo dui eros, non hendrerit orci faucibus eu. Integer at blandit ex. Duis posuere, leo non porta tincidunt, augue turpis posuere odio, sed faucibus erat elit vel turpis. Quisque vitae tristique leo.
}
