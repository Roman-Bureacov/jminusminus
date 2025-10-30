// Copyright 2012- Bill Campbell, Swami Iyer and Bahar Akbal-Delibas

package jminusminus;

import static jminusminus.CLConstants.DCONST_0;
import static jminusminus.CLConstants.DCONST_1;
import static jminusminus.CLConstants.FCONST_0;
import static jminusminus.CLConstants.FCONST_1;
import static jminusminus.CLConstants.FCONST_2;

/**
 * The AST node for a float literal.
 */
class JLiteralFloat extends JExpression {
    // String representation of the literal.
    private String text;

    /**
     * Constructs an AST node for a float literal given its line number and string representation.
     *
     * @param line line in which the literal occurs in the source file.
     * @param text string representation of the literal.
     */
    public JLiteralFloat(int line, String text) {
        super(line);
        this.text = text;
    }

    /**
     * Returns the literal as a float.
     *
     * @return the literal as a float.
     */
    public float toFloat() {
        return Float.parseFloat(text);
    }

    /**
     * {@inheritDoc}
     */
    public JExpression analyze(Context context) {
        type = Type.FLOAT;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    public void codegen(CLEmitter output) {
        final float f = toFloat();
        if (f == 0.0f) {
            output.addNoArgInstruction(FCONST_0);
        } else if (f == 1.0f) {
            output.addNoArgInstruction(FCONST_1);
        } else if (f == 2.0f) {
            output.addNoArgInstruction(FCONST_2);
        } else {
            output.addLDCInstruction(f);
        }
    }

    /**
     * {@inheritDoc}
     */
    public void toJSON(JSONElement json) {
        JSONElement e = new JSONElement();
        json.addChild("JLiteralFloat:" + line, e);
        e.addAttribute("type", type == null ? "" : type.toString());
        e.addAttribute("value", text);
    }
}
