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
package Constants;

/**
 *
 */
public class STATE {

    public final static int Idle = 0;
    public final static int Moving = 1;
    public final static int Rotating = 2;
    public final static int Melee = 3;
    public final static int Shooting = 4;
    public final static int RecDamage = 5;
    public final static int CastingSpell = 6;
    public final static int ResistSpell = 7;
    public final static int Dead = 8;

    public final static int COUNT = 9;

    public final static String[] NAMES = {
        "IDLE",
        "MOVING",
        "ROTATING",
        "MELEE",
        "SHOOTING",
        "RECEIVING DAMAGE",
        "CASTING SPELL",
        "DEAD"
    };

}