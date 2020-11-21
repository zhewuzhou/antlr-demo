package antlr.demo.visitor.propertiesfile;

import java.util.Map;
import java.util.TreeMap;

public class CollectPropsVisitor extends PropertyFileBaseVisitor<Void> {
    Map<String, String> props = new TreeMap<>();

    @Override
    public Void visitProp(PropertyFileParser.PropContext ctx) {
        String id = ctx.ID().getText();
        String value = ctx.STRING().getText();
        props.put(id, value);
        return null;
    }

    public Map<String, String> getProps() {
        return props;
    }
}
