/*
 * The MIT License
 *
 * Copyright (c) 2014 The Broad Institute
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
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package picard.sam.markduplicates;

import htsjdk.samtools.DuplicateScoringStrategy;
import picard.cmdline.CommandLineProgram;

/**
 * This class is an extension of AbstractMarkDuplicatesCommandLineProgramTester used to test MarkDuplicates with SAM files generated on the fly.
 * This performs the underlying tests defined by classes such as see AbstractMarkDuplicatesCommandLineProgramTest and MarkDuplicatesTest.
 */
public class MarkDuplicatesTester extends AbstractMarkDuplicatesCommandLineProgramTester {

    public MarkDuplicatesTester(DuplicateScoringStrategy.ScoringStrategy strategy) {
        super(strategy);
    }
    public MarkDuplicatesTester() {
        this(DuplicateScoringStrategy.ScoringStrategy.TOTAL_MAPPED_REFERENCE_LENGTH);
    }

    @Override
    protected CommandLineProgram getProgram() { return new MarkDuplicates(); }
}
