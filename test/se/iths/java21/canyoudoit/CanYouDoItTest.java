package se.iths.java21.canyoudoit;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.as;
import static org.assertj.core.api.Assertions.assertThat;

public class CanYouDoItTest {

    @Test
    void givenWordThatIsPalindromeShouldReturnTrue() {
        assertThat(CanYouDoIt.palindrome("Abba")).isTrue();
        assertThat(CanYouDoIt.palindrome("Racecar")).isTrue();
        assertThat(CanYouDoIt.palindrome("step on no pets")).isTrue();
        assertThat(CanYouDoIt.palindrome("02022020")).isTrue();
    }

    @Test
    void givenWordThatIsPalindromeIgnoringWhiteSpaceShouldReturnTrue() {
        assertThat(CanYouDoIt.palindrome("never odd or even")).isTrue();
        assertThat(CanYouDoIt.palindrome("top spot")).isTrue();
        assertThat(CanYouDoIt.palindrome("Murder for a jar of red rum")).isTrue();
        assertThat(CanYouDoIt.palindrome("Cigar? Toss it in a can. It is so tragic.")).isTrue();
        assertThat(CanYouDoIt.palindrome("Borrow or rob?")).isTrue();
    }

    @Test
    void givenTwoWordsThatAreAnagramsShouldReturnTrue() {
        //Anagram, Write a function that takes two words as an argument and returns true if they are anagrams (contain the exact same letters) and false otherwise.
    }

    //Reversing a list.


    //Array/List rotation
    //base = [1, 2, 3, 4, 5]
    //right_rotation = [5, 1, 2, 3, 4]
    //left_rotation = [2, 3, 4, 5, 1]
    //Rotating Multiple Positions?

    //Find longest word in text
    //Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas luctus ipsum et facilisis dignissim. Duis mattis enim urna. Quisque orci nunc, vulputate id accumsan nec, imperdiet sit amet sem. Integer consequat nibh vel mattis elementum. Nam est elit, sodales vitae augue nec, consequat porttitor nibh. Aliquam ut risus vehicula, egestas ligula sed, egestas neque. Fusce hendrerit vel risus in molestie. Morbi molestie eleifend odio vel ullamcorper. Donec at odio libero. Quisque vulputate nisl nisi, ut convallis lorem vulputate et. Aenean pretium eu tellus a dapibus. Ut id sem vulputate, finibus erat quis, vestibulum enim. Donec commodo dui eros, non hendrerit orci faucibus eu. Integer at blandit ex. Duis posuere, leo non porta tincidunt, augue turpis posuere odio, sed faucibus erat elit vel turpis. Quisque vitae tristique leo.




}
