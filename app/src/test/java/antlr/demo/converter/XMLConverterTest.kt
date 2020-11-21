package antlr.demo.converter

import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.tree.ParseTreeWalker
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test


internal class XMLConverterTest {
    @Test
    fun `should convert json to xml`() {
        //given
        val json = XMLConverterTest::class.java.getResourceAsStream("/t.json")
        val lexer = JSONLexer(CharStreams.fromStream(json))
        val parser = JSONParser(CommonTokenStream(lexer))
        val converter = XMLConverter()
        val root = parser.json()

        //when
        ParseTreeWalker().walk(converter, root)

        //then
        assertThat(converter.toXML(root).endsWith("</aliases>\n"), `is`(true))
    }
}