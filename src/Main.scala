package mypack
import jakarta.servlet.http.{HttpServlet, HttpServletRequest => HSReq, HttpServletResponse => HSResp}

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
  {
    val str = req.getMethod
    numReqs += 1
    resp.getWriter().println(html(str))
  }
}