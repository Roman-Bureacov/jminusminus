// Copyright 2012- Bill Campbell, Swami Iyer and Bahar Akbal-Delibas

package jminusminus;

import static jminusminus.CLConstants.*;

/**
 * The AST node for an if-statement.
 */
class JTernaryExpression extends JExpression {
    // Test expression.
    private JExpression condition;

    // Then part.
    private JStatement thenPart;

    // Else part.
    private JStatement elsePart;

    /**
     * Constructs an AST node for an if-statement.
     *
     * @param line      line in which the if-statement occurs in the source file.
     * @param condition test expression.
     * @param thenPart  then part.
     * @param elsePart  else part.
     */
    public JTernaryExpression(int line, JExpression condition, JStatement thenPart, JStatement elsePart) {
        super(line);
        this.condition = condition;
        this.thenPart = thenPart;
        this.elsePart = elsePart;
    }

    /**
     * Constructs an AST node for an expression.
     *
     * @param line line in which the expression occurs in the source file.
     */
    protected JTernaryExpression(final int line) {
        super(line);
    }

    /**
     * {@inheritDoc}
     */
    public JExpression analyze(Context context) {
        // TODO
        return this;
    }

    /**
     * {@inheritDoc}
     */
    public void codegen(CLEmitter output) {
        // TODO
    }

    /**
     * {@inheritDoc}
     */
    public void toJSON(JSONElement json) {
        JSONElement e = new JSONElement();
        json.addChild("JTernaryOperator:" + line, e);
        JSONElement e1 = new JSONElement();
        e.addChild("Condition", e1);
        condition.toJSON(e1);
        JSONElement e2 = new JSONElement();
        e.addChild("ThenPart", e2);
        thenPart.toJSON(e2);
        if (elsePart != null) {
            JSONElement e3 = new JSONElement();
            e.addChild("ElsePart", e3);
            elsePart.toJSON(e3);
        }
    }
}
