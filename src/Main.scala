package mypack
import jakarta.servlet.http.{Cookie, HttpServlet, HttpServletRequest as HSReq, HttpServletResponse as HSResp}

class ServApp extends HttpServlet
{
  var numReqs: Int = 0
  def html(str: String): String =
    s"""<body>
      |<h1>This is the start!</h1>
      |<p>This is some info. $str</p>
      |<p>This is requst number $numReqs.</p>
      |</body>
      |""".stripMargin

  override def doGet(req: HSReq, resp: HSResp): Unit =
  { val str = req.getMethod
    numReqs += 1
    val cookies = req.getCookies
    val str2 = if (cookies == null) "null" else "Yeah " + cookies(0).toString//cookies.toString
    resp.getWriter().println(html(str + str2))
    val c = Cookie("Visit", "1")
    resp.addCookie(c)
  }
}