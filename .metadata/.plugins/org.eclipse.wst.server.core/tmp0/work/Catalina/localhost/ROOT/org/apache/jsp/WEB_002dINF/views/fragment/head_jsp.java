/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.70
 * Generated at: 2022-03-03 15:54:50 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.fragment;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import a.b.c.com.member.vo.MemberVO;
import java.util.ArrayList;

public final class head_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("a.b.c.com.member.vo.MemberVO");
    _jspx_imports_classes.add("java.util.ArrayList");
  }

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
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP?????? ?????? GET, POST ?????? HEAD ??????????????? ???????????????. Jasper??? OPTIONS ????????? ?????? ???????????????.");
      return;
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>MAIN</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("	.m{\r\n");
      out.write("		text-align: center;\r\n");
      out.write("	}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body> \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<nav class=\"navbar col-lg-12 col-12 p-0 fixed-top d-flex flex-row\">\r\n");
      out.write("      <div class=\"text-center navbar-brand-wrapper d-flex align-items-center justify-content-center\">\r\n");
      out.write("        <a class=\"navbar-brand brand-logo mr-5\" href=\"index.html\"><img src=\"images/logo.svg\" class=\"mr-2\" alt=\"logo\"></a>\r\n");
      out.write("        <a class=\"navbar-brand brand-logo-mini\" href=\"index.html\"><img src=\"images/logo-mini.svg\" alt=\"logo\"></a>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"navbar-menu-wrapper d-flex align-items-center justify-content-end\">\r\n");
      out.write("        <button class=\"navbar-toggler navbar-toggler align-self-center\" type=\"button\" data-toggle=\"minimize\">\r\n");
      out.write("          <span class=\"icon-menu\"></span>\r\n");
      out.write("        </button>\r\n");
      out.write("        <ul class=\"navbar-nav mr-lg-2\">\r\n");
      out.write("          <li class=\"nav-item nav-search d-none d-lg-block\">\r\n");
      out.write("            <div class=\"input-group\">\r\n");
      out.write("              <div class=\"input-group-prepend hover-cursor\" id=\"navbar-search-icon\">\r\n");
      out.write("                <span class=\"input-group-text\" id=\"search\">\r\n");
      out.write("                  <i class=\"icon-search\"></i>\r\n");
      out.write("                </span>\r\n");
      out.write("              </div>\r\n");
      out.write("              <input type=\"text\" class=\"form-control\" id=\"navbar-search-input\" placeholder=\"Search now\" aria-label=\"search\" aria-describedby=\"search\">\r\n");
      out.write("            </div>\r\n");
      out.write("          </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("        <ul class=\"navbar-nav navbar-nav-right\">\r\n");
      out.write("          <li class=\"nav-item dropdown\">\r\n");
      out.write("            <a class=\"nav-link count-indicator dropdown-toggle\" id=\"notificationDropdown\" href=\"#\" data-toggle=\"dropdown\">\r\n");
      out.write("              <i class=\"icon-bell mx-0\"></i>\r\n");
      out.write("              <span class=\"count\"></span>\r\n");
      out.write("            </a>\r\n");
      out.write("            <div class=\"dropdown-menu dropdown-menu-right navbar-dropdown preview-list\" aria-labelledby=\"notificationDropdown\">\r\n");
      out.write("              <p class=\"mb-0 font-weight-normal float-left dropdown-header\">Notifications</p>\r\n");
      out.write("              <a class=\"dropdown-item preview-item\">\r\n");
      out.write("                <div class=\"preview-thumbnail\">\r\n");
      out.write("                  <div class=\"preview-icon bg-success\">\r\n");
      out.write("                    <i class=\"ti-info-alt mx-0\"></i>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"preview-item-content\">\r\n");
      out.write("                  <h6 class=\"preview-subject font-weight-normal\">Application Error</h6>\r\n");
      out.write("                  <p class=\"font-weight-light small-text mb-0 text-muted\">\r\n");
      out.write("                    Just now\r\n");
      out.write("                  </p>\r\n");
      out.write("                </div>\r\n");
      out.write("              </a>\r\n");
      out.write("              <a class=\"dropdown-item preview-item\">\r\n");
      out.write("                <div class=\"preview-thumbnail\">\r\n");
      out.write("                  <div class=\"preview-icon bg-warning\">\r\n");
      out.write("                    <i class=\"ti-settings mx-0\"></i>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"preview-item-content\">\r\n");
      out.write("                  <h6 class=\"preview-subject font-weight-normal\">Settings</h6>\r\n");
      out.write("                  <p class=\"font-weight-light small-text mb-0 text-muted\">\r\n");
      out.write("                    Private message\r\n");
      out.write("                  </p>\r\n");
      out.write("                </div>\r\n");
      out.write("              </a>\r\n");
      out.write("              <a class=\"dropdown-item preview-item\">\r\n");
      out.write("                <div class=\"preview-thumbnail\">\r\n");
      out.write("                  <div class=\"preview-icon bg-info\">\r\n");
      out.write("                    <i class=\"ti-user mx-0\"></i>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"preview-item-content\">\r\n");
      out.write("                  <h6 class=\"preview-subject font-weight-normal\">New user registration</h6>\r\n");
      out.write("                  <p class=\"font-weight-light small-text mb-0 text-muted\">\r\n");
      out.write("                    2 days ago\r\n");
      out.write("                  </p>\r\n");
      out.write("                </div>\r\n");
      out.write("              </a>\r\n");
      out.write("            </div>\r\n");
      out.write("          </li>\r\n");
      out.write("          <li class=\"nav-item nav-profile dropdown\">\r\n");
      out.write("            <a class=\"nav-link dropdown-toggle\" href=\"#\" data-toggle=\"dropdown\" id=\"profileDropdown\">\r\n");
      out.write("              <img src=\"images/faces/face28.jpg\" alt=\"profile\">  \r\n");
      out.write("            </a>\r\n");
      out.write("            <div class=\"dropdown-menu dropdown-menu-right navbar-dropdown\" aria-labelledby=\"profileDropdown\">\r\n");
      out.write("              <a class=\"dropdown-item\">\r\n");
      out.write("                <i class=\"ti-settings text-primary\"></i>\r\n");
      out.write("                Settings\r\n");
      out.write("              </a>\r\n");
      out.write("              \r\n");
      out.write("          <!-- Logout ?????? -->\r\n");
      out.write("              <a class=\"dropdown-item\" href=\"logout.kmj\">\r\n");
      out.write("                <i class=\"ti-power-off text-primary\"></i>\r\n");
      out.write("                Logout\r\n");
      out.write("              </a>\r\n");
      out.write("              \r\n");
      out.write("            </div>\r\n");
      out.write("          </li>\r\n");
      out.write("          <li class=\"nav-item nav-settings d-none d-lg-flex\">\r\n");
      out.write("            <a class=\"nav-link\" href=\"#\">\r\n");
      out.write("              <i class=\"icon-ellipsis\"></i>\r\n");
      out.write("            </a>\r\n");
      out.write("          </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("        <button class=\"navbar-toggler navbar-toggler-right d-lg-none align-self-center\" type=\"button\" data-toggle=\"offcanvas\">\r\n");
      out.write("          <span class=\"icon-menu\"></span>\r\n");
      out.write("        </button>\r\n");
      out.write("      </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("   </body>\r\n");
      out.write(" </html>");
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
}
