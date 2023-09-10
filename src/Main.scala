import jakarta.servlet.http.{HttpServlet, HttpServletRequest => HSReq, HttpServletResponse => HSResp}

class ServApp extends HttpServlet
{
  def html: String =
    """<body>
      |<h1>This is the start!</h1>
      |<p>This is the body.</p>
      |</body>
      |""".stripMargin
  override def doGet(req: HSReq, resp: HSResp): Unit =
  {
    resp.getWriter().println(html)
  }
}