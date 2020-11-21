package antlr.demo.converter

import antlr.demo.converter.JSONParser.*
import org.antlr.v4.runtime.tree.ParseTree
import org.antlr.v4.runtime.tree.ParseTreeProperty

class XMLConverter : JSONBaseListener() {
    private val xml = ParseTreeProperty<String>()

    private companion object {
        const val LINE_BREAK = "\n"
    }

    override fun exitJson(ctx: JsonContext) {
        xml.put(ctx, xml[ctx.getChild(0)])
    }

    override fun exitAnObject(ctx: AnObjectContext) {
        val buf = StringBuilder()
        buf.append(LINE_BREAK)
        for (child in ctx.pair()) {
            buf.append(xml[child!!])
        }
        xml.put(ctx, buf.toString())
    }

    override fun exitEmptyObject(ctx: EmptyObjectContext) {
        xml.put(ctx, "")
    }

    override fun exitArrayOfValues(ctx: ArrayOfValuesContext) {
        val buf = StringBuilder()
        buf.append(LINE_BREAK)
        for (child in ctx.value()) {
            buf.append("<element>")
            buf.append(xml[child!!])
            buf.append("</element>")
            buf.append(LINE_BREAK)
        }
        xml.put(ctx, buf.toString())
    }

    override fun exitEmptyArray(ctx: EmptyArrayContext) {
        xml.put(ctx, "")
    }

    override fun exitPair(ctx: PairContext) {
        val tag = stripQuotes(ctx.STRING().text)
        val child = ctx.value()
        val x = "<$tag>${xml[child]}</$tag>\n"
        xml.put(ctx, x)
    }

    override fun exitObjectValue(ctx: ObjectValueContext) {
        xml.put(ctx, xml[ctx.`object`()])
    }

    override fun exitArrayValue(ctx: ArrayValueContext) {
        xml.put(ctx, xml[ctx.array()])
    }

    override fun exitAtom(ctx: AtomContext) {
        xml.put(ctx, ctx.text)
    }

    override fun exitString(ctx: StringContext) {
        xml.put(ctx, stripQuotes(ctx.text))
    }

    private fun stripQuotes(s: String?): String? {
        return if (s == null || s[0] != '"') s else s.substring(1, s.length - 1)
    }

    fun toXML(root: ParseTree): String {
        return xml[root]
    }
}

