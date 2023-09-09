import jakarta.servlet.http.{HttpServlet, HttpServletRequest => HSReq, HttpServletResponse => HSResp}

object ServApp extends HttpServlet
{
  def html =
    """<body>
      |<h1>This is the start!</h1>
      |<p>This is the body.</p>
      |</body>
      |""".stripMargin
  override def doGet(req: HSReq, resp: HSResp): Unit =
  {
    resp.getWriter().print(html)
  }
} 
