/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.16
 * Generated at: 2019-03-22 06:35:52 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.userFolder;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/C:/Users/Training/Desktop/My%20Employee%20Project/.metadata/.plugins/org.eclipse.wst.server.core/tmp1/wtpwebapps/employee/WEB-INF/lib/spring-webmvc-5.1.5.RELEASE.jar!/META-INF/spring-form.tld", Long.valueOf(1550016212000L));
    _jspx_dependants.put("/WEB-INF/lib/spring-webmvc-5.1.5.RELEASE.jar", Long.valueOf(1553057681154L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fform_0026_005fmodelAttribute_005fmethod;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005finput_0026_005fpath_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fpassword_0026_005fpath_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fs_005fform_0026_005fmodelAttribute_005fmethod = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005finput_0026_005fpath_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fpassword_0026_005fpath_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005fform_0026_005fmodelAttribute_005fmethod.release();
    _005fjspx_005ftagPool_005fs_005finput_0026_005fpath_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005fpassword_0026_005fpath_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t");
      if (_jspx_meth_s_005fform_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_s_005fform_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:form
    org.springframework.web.servlet.tags.form.FormTag _jspx_th_s_005fform_005f0 = (org.springframework.web.servlet.tags.form.FormTag) _005fjspx_005ftagPool_005fs_005fform_0026_005fmodelAttribute_005fmethod.get(org.springframework.web.servlet.tags.form.FormTag.class);
    boolean _jspx_th_s_005fform_005f0_reused = false;
    try {
      _jspx_th_s_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_s_005fform_005f0.setParent(null);
      // /WEB-INF/views/userFolder/register.jsp(12,1) name = method type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fform_005f0.setMethod("post");
      // /WEB-INF/views/userFolder/register.jsp(12,1) name = modelAttribute type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fform_005f0.setModelAttribute("user");
      int[] _jspx_push_body_count_s_005fform_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_s_005fform_005f0 = _jspx_th_s_005fform_005f0.doStartTag();
        if (_jspx_eval_s_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("\t\t<table style=\"background-color: gray; margin: auto;\">\r\n");
            out.write("\t\t\t<tr>\r\n");
            out.write("\t\t\t\t<td>Enter User Name</td>\r\n");
            out.write("\t\t\t\t<td>");
            if (_jspx_meth_s_005finput_005f0(_jspx_th_s_005fform_005f0, _jspx_page_context, _jspx_push_body_count_s_005fform_005f0))
              return true;
            out.write("</td>\r\n");
            out.write("\t\t\t</tr>\r\n");
            out.write("\t\t\t<tr>\r\n");
            out.write("\t\t\t\t<td>Enter Password</td>\r\n");
            out.write("\t\t\t\t<td>");
            if (_jspx_meth_s_005fpassword_005f0(_jspx_th_s_005fform_005f0, _jspx_page_context, _jspx_push_body_count_s_005fform_005f0))
              return true;
            out.write("</td>\r\n");
            out.write("\t\t\t</tr>\r\n");
            out.write("\t\t\t\r\n");
            out.write("\t\t\t\t<tr>\r\n");
            out.write("\t\t\t\t<td><input type=\"submit\" value=\"Register\" /></td>\r\n");
            out.write("\t\t\t</tr>\r\n");
            out.write("\t\t</table>\r\n");
            out.write("\t");
            int evalDoAfterBody = _jspx_th_s_005fform_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_s_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_s_005fform_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_s_005fform_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_s_005fform_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fs_005fform_0026_005fmodelAttribute_005fmethod.reuse(_jspx_th_s_005fform_005f0);
      _jspx_th_s_005fform_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_s_005fform_005f0, _jsp_getInstanceManager(), _jspx_th_s_005fform_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_s_005finput_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_s_005fform_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_s_005finput_005f0 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fs_005finput_0026_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    boolean _jspx_th_s_005finput_005f0_reused = false;
    try {
      _jspx_th_s_005finput_005f0.setPageContext(_jspx_page_context);
      _jspx_th_s_005finput_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
      // /WEB-INF/views/userFolder/register.jsp(16,8) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005finput_005f0.setPath("uname");
      int[] _jspx_push_body_count_s_005finput_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_s_005finput_005f0 = _jspx_th_s_005finput_005f0.doStartTag();
        if (_jspx_th_s_005finput_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_s_005finput_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_s_005finput_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_s_005finput_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fs_005finput_0026_005fpath_005fnobody.reuse(_jspx_th_s_005finput_005f0);
      _jspx_th_s_005finput_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_s_005finput_005f0, _jsp_getInstanceManager(), _jspx_th_s_005finput_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_s_005fpassword_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_s_005fform_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:password
    org.springframework.web.servlet.tags.form.PasswordInputTag _jspx_th_s_005fpassword_005f0 = (org.springframework.web.servlet.tags.form.PasswordInputTag) _005fjspx_005ftagPool_005fs_005fpassword_0026_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.PasswordInputTag.class);
    boolean _jspx_th_s_005fpassword_005f0_reused = false;
    try {
      _jspx_th_s_005fpassword_005f0.setPageContext(_jspx_page_context);
      _jspx_th_s_005fpassword_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
      // /WEB-INF/views/userFolder/register.jsp(20,8) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fpassword_005f0.setPath("pass");
      int[] _jspx_push_body_count_s_005fpassword_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_s_005fpassword_005f0 = _jspx_th_s_005fpassword_005f0.doStartTag();
        if (_jspx_th_s_005fpassword_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_s_005fpassword_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_s_005fpassword_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_s_005fpassword_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fs_005fpassword_0026_005fpath_005fnobody.reuse(_jspx_th_s_005fpassword_005f0);
      _jspx_th_s_005fpassword_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_s_005fpassword_005f0, _jsp_getInstanceManager(), _jspx_th_s_005fpassword_005f0_reused);
    }
    return false;
  }
}
