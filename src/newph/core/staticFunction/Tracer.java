/*
 * MIT License
 *
 * Copyright (c) 2017
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package newph.core.staticFunction;

/**
 * Tracer of possible errors.
 * TODO: Write a normal trace!
 * @author SerVB
 * @since PPH 0
 */
public final class Tracer {

    /**
     * Checks if it's an error. Traces if there is an error.
     * @param noError true if no error, else false.
     */
    public static void check(final boolean noError) {
        if(noError == false) {
            doThrow("An error detected!!!");
        }
    }

    /**
     * Checks if it's an error. Traces if xx == 0.
     * @param xx 0 if there is an error.
     */
    public static void check(final int xx) {
        check(xx != 0);
    }

    /**
     * Traces anyway.
     * @param msg Error message.
     */
    public static void check(String msg) {
        doThrow(msg);
    }
    
    /**
     * Throws exception anyway.
     * @param msg Error message.
     */
    private static void doThrow(final String msg) {
        throw new IllegalArgumentException("fatal > " + "tracer: " + msg);
    }
}
