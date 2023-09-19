package mypack
import jakarta.servlet.http.{HttpServlet, HttpServletRequest => HSReq, HttpServletResponse => HSResp}

class ServApp extends HttpServlet
{
  def html(str: String): String =
    s"""<body>
      |<h1>This is the start!</h1>
      |<p>This is some info. $str</p>
      |</body>
      |""".stripMargin
  override def doGet(req: HSReq, resp: HSResp): Unit =
  {
    val str = req.getMethod
    resp.getWriter().println(html(str))
  }
}