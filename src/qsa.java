import jaggl.OpenGL;

final class qsa extends tha {

   Object[] t;
   static int u;
   static int x;
   static int v;
   static int w;


   static final Object[] a(byte var0, int var1, Object[] var2, Object[] var3, Object[] var4) {
      ++x;
      hc.a(var2, -35);
      var2[1] = var3;
      int var5 = -97 % ((var0 + 42) / 59);
      if(null != var2[1]) {
         jla.a((Object[])((Object[])var2[1]), (byte)-115, 54);
      }

      return var2;
   }

   static final String a(byte var0, Object[] var1, int var2) {
      ++v;
      String var3 = (String)var1[0];
      if(var0 != -77) {
         return (String)null;
      } else if(var1 != null && var1.length == 2) {
         return null;
      } else {
         while(true) {
            int var4 = var3.indexOf("%1");
            if(0 > var4) {
               return var3;
            }

            String var5 = var3.substring(0, var4);
            String var6 = Integer.toString(var2);
            var3 = var5 + var6 + var3.substring(2 + var4);
         }
      }
   }

   qsa(Object[] var1) {
      this.t = var1;
   }

   static final void a(Object[] var0, Object[] var1, Object[] var2, byte var3, int var4) {
      if(var3 <= -120) {
         ++u;
         int var5 = tea.a(false, var2);
         if(-1 != var5) {
            if(null == var0) {
               var0 = (Object[])((Object[])((Object[])((Object[])var1[15]))[37]);
            }

            if(((int[])((int[])((Object[])((Object[])var1[15]))[1]))[8] > var4) {
               sj.a((Object[])((Object[])var1[15]), (byte)-103, var4);
               ah.a((Object[])((Object[])var1[15]), var0, (byte)99);
            } else {
               OpenGL.glActiveTexture('\u84c0' + var4);
               OpenGL.glBindTexture(((int[])((int[])var0[1]))[2], ((int[])((int[])var0[1]))[0]);
            }

            if(var4 != ((int[])((int[])var1[10]))[var5]) {
               ((int[])((int[])var1[10]))[var5] = var4;
               OpenGL.glUniform1i(var5, var4);
            }

         }
      }
   }

   static final int a(byte var0, Object[] var1) {
      if(var0 != -9) {
         a(((byte[])((byte[])var1[6]))[2], (Object[])((Object[])var1[0]));
      }

      ++w;
      return ((Object[])((Object[])var1[3])).length;
   }

}
