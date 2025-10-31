// Copyright 2012- Bill Campbell, Swami Iyer and Bahar Akbal-Delibas

package jminusminus;

import java.util.ArrayList;

/**
 * The AST node for a for-statement.
 */
class JForStatement extends JStatement {
    // Initialization.
    private ArrayList<JStatement> init;

    // Test expression
    private JExpression condition;

    // Update.
    private ArrayList<JStatement> update;

    // The body.
    private JStatement body;

    /**
     * Constructs an AST node for a for-statement.
     *
     * @param line      line in which the for-statement occurs in the source file.
     * @param init      the initialization.
     * @param condition the test expression.
     * @param update    the update.
     * @param body      the body.
     */
    public JForStatement(int line, ArrayList<JStatement> init, JExpression condition,
                         ArrayList<JStatement> update, JStatement body) {
        super(line);
        this.init = init;
        this.condition = condition;
        this.update = update;
        this.body = body;
    }

    /**
     * {@inheritDoc}
     */
    public JForStatement analyze(Context context) {
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
        json.addChild("JForStatement:" + line, e);
        if (init != null) {
            JSONElement e1 = new JSONElement();
            e.addChild("Init", e1);
            for (JStatement stmt : init) {
                stmt.toJSON(e1);
            }
        }
        if (condition != null) {
            JSONElement e1 = new JSONElement();
            e.addChild("Condition", e1);
            condition.toJSON(e1);
        }
        if (update != null) {
            JSONElement e1 = new JSONElement();
            e.addChild("Update", e1);
            for (JStatement stmt : update) {
                stmt.toJSON(e1);
            }
        }
        if (body != null) {
            JSONElement e1 = new JSONElement();
            e.addChild("Body", e1);
            body.toJSON(e1);
        }
    }
}

/**
 * The AST node for a foreach-statement.
 */
class JForeachStatement extends JStatement {
    // Test expression
    private JVariableDeclarator declarator;

    // Update.
    private JExpression name;

    // The body.
    private JStatement body;

    /**
     * Constructs an AST node for a for-statement.
     *
     * @param line       line in which the for-statement occurs in the source file.
     * @param declarator the loop variable declarator.
     * @param name       the name of the iterated variable.
     * @param body       the body.
     */
    public JForeachStatement(int line, JVariableDeclarator declarator, JExpression name, JStatement body) {
        super(line);
        this.declarator = declarator;
        this.name = name;
        this.body = body;
    }

    /**
     * {@inheritDoc}
     */
    public JForeachStatement analyze(Context context) {
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
        json.addChild("JForeachStatement:" + line, e);
        if (declarator != null) {
            JSONElement e1 = new JSONElement();
            e.addChild("Declarator", e1);
            declarator.toJSON(e1);
        }
        if (name != null) {
            JSONElement e1 = new JSONElement();
            e.addChild("Update", e1);
            name.toJSON(e1);
        }
        if (body != null) {
            JSONElement e1 = new JSONElement();
            e.addChild("Body", e1);
            body.toJSON(e1);
        }
    }
}