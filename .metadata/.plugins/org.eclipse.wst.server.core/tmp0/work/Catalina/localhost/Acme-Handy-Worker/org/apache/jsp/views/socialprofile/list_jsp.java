/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.35
 * Generated at: 2019-01-15 16:24:32 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.socialprofile;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fdisplay_005ftable_0026_005frequestURI_005fpagesize_005fname_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fvar_005fcode_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fsortable_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fjstl_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fdisplay_005fcolumn;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fdisplay_005ftable_0026_005frequestURI_005fpagesize_005fname_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fvar_005fcode_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fsortable_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fjstl_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fdisplay_005fcolumn = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fdisplay_005ftable_0026_005frequestURI_005fpagesize_005fname_005fid.release();
    _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fvar_005fcode_005fnobody.release();
    _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fsortable_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fjstl_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fdisplay_005fcolumn.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      //  display:table
      org.displaytag.tags.TableTag _jspx_th_display_005ftable_005f0 = (org.displaytag.tags.TableTag) _005fjspx_005ftagPool_005fdisplay_005ftable_0026_005frequestURI_005fpagesize_005fname_005fid.get(org.displaytag.tags.TableTag.class);
      _jspx_th_display_005ftable_005f0.setPageContext(_jspx_page_context);
      _jspx_th_display_005ftable_005f0.setParent(null);
      // /views/socialprofile/list.jsp(19,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005ftable_005f0.setName("socialProfiles");
      // /views/socialprofile/list.jsp(19,0) name = id type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005ftable_005f0.setUid("socialProfile");
      // /views/socialprofile/list.jsp(19,0) name = requestURI type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005ftable_005f0.setRequestURI((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("socialprofile/actor/list.do?actorId=${actorId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      // /views/socialprofile/list.jsp(19,0) name = pagesize type = int reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005ftable_005f0.setPagesize(5);
      int _jspx_eval_display_005ftable_005f0 = _jspx_th_display_005ftable_005f0.doStartTag();
      if (_jspx_eval_display_005ftable_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        java.lang.Object socialProfile = null;
        java.lang.Integer socialProfile_rowNum = null;
        if (_jspx_eval_display_005ftable_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_display_005ftable_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_display_005ftable_005f0.doInitBody();
        }
        socialProfile = (java.lang.Object) _jspx_page_context.findAttribute("socialProfile");
        socialProfile_rowNum = (java.lang.Integer) _jspx_page_context.findAttribute("socialProfile_rowNum");
        do {
          out.write("\r\n");
          out.write("\r\n");
          out.write("\t");
          if (_jspx_meth_spring_005fmessage_005f0(_jspx_th_display_005ftable_005f0, _jspx_page_context))
            return;
          out.write('\r');
          out.write('\n');
          out.write('	');
          if (_jspx_meth_display_005fcolumn_005f0(_jspx_th_display_005ftable_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\r\n");
          out.write("\t");
          if (_jspx_meth_spring_005fmessage_005f1(_jspx_th_display_005ftable_005f0, _jspx_page_context))
            return;
          out.write('\r');
          out.write('\n');
          out.write('	');
          if (_jspx_meth_display_005fcolumn_005f1(_jspx_th_display_005ftable_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\r\n");
          out.write("\t");
          if (_jspx_meth_spring_005fmessage_005f2(_jspx_th_display_005ftable_005f0, _jspx_page_context))
            return;
          out.write('\r');
          out.write('\n');
          out.write('	');
          if (_jspx_meth_display_005fcolumn_005f2(_jspx_th_display_005ftable_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\r\n");
          out.write("\t");
          if (_jspx_meth_jstl_005fif_005f0(_jspx_th_display_005ftable_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\r\n");
          int evalDoAfterBody = _jspx_th_display_005ftable_005f0.doAfterBody();
          socialProfile = (java.lang.Object) _jspx_page_context.findAttribute("socialProfile");
          socialProfile_rowNum = (java.lang.Integer) _jspx_page_context.findAttribute("socialProfile_rowNum");
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_display_005ftable_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_display_005ftable_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fdisplay_005ftable_0026_005frequestURI_005fpagesize_005fname_005fid.reuse(_jspx_th_display_005ftable_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fdisplay_005ftable_0026_005frequestURI_005fpagesize_005fname_005fid.reuse(_jspx_th_display_005ftable_005f0);
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_spring_005fmessage_005f4(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<a href=\"socialprofile/actor/create.do\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${createTitle}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</a>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_spring_005fmessage_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_display_005ftable_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f0 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fvar_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f0.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_005ftable_005f0);
    // /views/socialprofile/list.jsp(21,1) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f0.setCode("socialprofile.nick");
    // /views/socialprofile/list.jsp(21,1) name = var type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f0.setVar("nickTitle");
    int[] _jspx_push_body_count_spring_005fmessage_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f0 = _jspx_th_spring_005fmessage_005f0.doStartTag();
      if (_jspx_th_spring_005fmessage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f0.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fvar_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_display_005fcolumn_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_display_005ftable_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  display:column
    org.displaytag.tags.ColumnTag _jspx_th_display_005fcolumn_005f0 = (org.displaytag.tags.ColumnTag) _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fsortable_005fproperty_005fnobody.get(org.displaytag.tags.ColumnTag.class);
    _jspx_th_display_005fcolumn_005f0.setPageContext(_jspx_page_context);
    _jspx_th_display_005fcolumn_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_005ftable_005f0);
    // /views/socialprofile/list.jsp(22,1) name = title type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_display_005fcolumn_005f0.setTitle((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${nickTitle}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
    // /views/socialprofile/list.jsp(22,1) name = sortable type = boolean reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_display_005fcolumn_005f0.setSortable(false);
    // /views/socialprofile/list.jsp(22,1) name = property type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_display_005fcolumn_005f0.setProperty("nick");
    int _jspx_eval_display_005fcolumn_005f0 = _jspx_th_display_005fcolumn_005f0.doStartTag();
    if (_jspx_th_display_005fcolumn_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fsortable_005fproperty_005fnobody.reuse(_jspx_th_display_005fcolumn_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fsortable_005fproperty_005fnobody.reuse(_jspx_th_display_005fcolumn_005f0);
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_display_005ftable_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f1 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fvar_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f1.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_005ftable_005f0);
    // /views/socialprofile/list.jsp(24,1) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f1.setCode("socialprofile.networkname");
    // /views/socialprofile/list.jsp(24,1) name = var type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f1.setVar("networkNameTitle");
    int[] _jspx_push_body_count_spring_005fmessage_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f1 = _jspx_th_spring_005fmessage_005f1.doStartTag();
      if (_jspx_th_spring_005fmessage_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f1.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fvar_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_display_005fcolumn_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_display_005ftable_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  display:column
    org.displaytag.tags.ColumnTag _jspx_th_display_005fcolumn_005f1 = (org.displaytag.tags.ColumnTag) _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fsortable_005fproperty_005fnobody.get(org.displaytag.tags.ColumnTag.class);
    _jspx_th_display_005fcolumn_005f1.setPageContext(_jspx_page_context);
    _jspx_th_display_005fcolumn_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_005ftable_005f0);
    // /views/socialprofile/list.jsp(25,1) name = title type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_display_005fcolumn_005f1.setTitle((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${networkNameTitle}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
    // /views/socialprofile/list.jsp(25,1) name = sortable type = boolean reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_display_005fcolumn_005f1.setSortable(false);
    // /views/socialprofile/list.jsp(25,1) name = property type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_display_005fcolumn_005f1.setProperty("networkName");
    int _jspx_eval_display_005fcolumn_005f1 = _jspx_th_display_005fcolumn_005f1.doStartTag();
    if (_jspx_th_display_005fcolumn_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fsortable_005fproperty_005fnobody.reuse(_jspx_th_display_005fcolumn_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fsortable_005fproperty_005fnobody.reuse(_jspx_th_display_005fcolumn_005f1);
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_display_005ftable_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f2 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fvar_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f2.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_005ftable_005f0);
    // /views/socialprofile/list.jsp(27,1) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f2.setCode("socialprofile.profile");
    // /views/socialprofile/list.jsp(27,1) name = var type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f2.setVar("profileTitle");
    int[] _jspx_push_body_count_spring_005fmessage_005f2 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f2 = _jspx_th_spring_005fmessage_005f2.doStartTag();
      if (_jspx_th_spring_005fmessage_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f2.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fvar_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f2);
    }
    return false;
  }

  private boolean _jspx_meth_display_005fcolumn_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_display_005ftable_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  display:column
    org.displaytag.tags.ColumnTag _jspx_th_display_005fcolumn_005f2 = (org.displaytag.tags.ColumnTag) _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fproperty_005fnobody.get(org.displaytag.tags.ColumnTag.class);
    _jspx_th_display_005fcolumn_005f2.setPageContext(_jspx_page_context);
    _jspx_th_display_005fcolumn_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_005ftable_005f0);
    // /views/socialprofile/list.jsp(28,1) name = title type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_display_005fcolumn_005f2.setTitle((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${profileTitle}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
    // /views/socialprofile/list.jsp(28,1) name = property type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_display_005fcolumn_005f2.setProperty("profile");
    int _jspx_eval_display_005fcolumn_005f2 = _jspx_th_display_005fcolumn_005f2.doStartTag();
    if (_jspx_th_display_005fcolumn_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fproperty_005fnobody.reuse(_jspx_th_display_005fcolumn_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fproperty_005fnobody.reuse(_jspx_th_display_005fcolumn_005f2);
    return false;
  }

  private boolean _jspx_meth_jstl_005fif_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_display_005ftable_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  jstl:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_jstl_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fjstl_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_jstl_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_jstl_005fif_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_005ftable_005f0);
    // /views/socialprofile/list.jsp(30,1) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_jstl_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${isPrincipalAuthorizedEdit}", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_jstl_005fif_005f0 = _jspx_th_jstl_005fif_005f0.doStartTag();
    if (_jspx_eval_jstl_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t");
        if (_jspx_meth_spring_005fmessage_005f3(_jspx_th_jstl_005fif_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t");
        if (_jspx_meth_display_005fcolumn_005f3(_jspx_th_jstl_005fif_005f0, _jspx_page_context))
          return true;
        out.write('\r');
        out.write('\n');
        out.write('	');
        int evalDoAfterBody = _jspx_th_jstl_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_jstl_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fjstl_005fif_0026_005ftest.reuse(_jspx_th_jstl_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fjstl_005fif_0026_005ftest.reuse(_jspx_th_jstl_005fif_005f0);
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_jstl_005fif_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f3 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fvar_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f3.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_jstl_005fif_005f0);
    // /views/socialprofile/list.jsp(31,2) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f3.setCode("socialprofile.edit");
    // /views/socialprofile/list.jsp(31,2) name = var type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f3.setVar("editTitle");
    int[] _jspx_push_body_count_spring_005fmessage_005f3 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f3 = _jspx_th_spring_005fmessage_005f3.doStartTag();
      if (_jspx_th_spring_005fmessage_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f3.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fvar_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f3);
    }
    return false;
  }

  private boolean _jspx_meth_display_005fcolumn_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_jstl_005fif_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  display:column
    org.displaytag.tags.ColumnTag _jspx_th_display_005fcolumn_005f3 = (org.displaytag.tags.ColumnTag) _005fjspx_005ftagPool_005fdisplay_005fcolumn.get(org.displaytag.tags.ColumnTag.class);
    _jspx_th_display_005fcolumn_005f3.setPageContext(_jspx_page_context);
    _jspx_th_display_005fcolumn_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_jstl_005fif_005f0);
    int _jspx_eval_display_005fcolumn_005f3 = _jspx_th_display_005fcolumn_005f3.doStartTag();
    if (_jspx_eval_display_005fcolumn_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_display_005fcolumn_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_display_005fcolumn_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_display_005fcolumn_005f3.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t<a href=\"socialprofile/actor/edit.do?socialProfileId=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${socialProfile.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write('"');
        out.write('>');
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${editTitle}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write("</a>\r\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_display_005fcolumn_005f3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_display_005fcolumn_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_display_005fcolumn_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fdisplay_005fcolumn.reuse(_jspx_th_display_005fcolumn_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fdisplay_005fcolumn.reuse(_jspx_th_display_005fcolumn_005f3);
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f4(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f4 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fvar_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f4.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f4.setParent(null);
    // /views/socialprofile/list.jsp(39,0) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f4.setCode("socialprofile.create");
    // /views/socialprofile/list.jsp(39,0) name = var type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f4.setVar("createTitle");
    int[] _jspx_push_body_count_spring_005fmessage_005f4 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f4 = _jspx_th_spring_005fmessage_005f4.doStartTag();
      if (_jspx_th_spring_005fmessage_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f4.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fvar_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f4);
    }
    return false;
  }
}