import jagdx.IDirect3DIndexBuffer;
import jaggl.OpenGL;

final class nfa {

   static int b;
   static int g;
   static int e;
   static int a;
   static int c;
   static Object[] f = sd.a(new Object[1], 7, (byte)125);
   static boolean d = true;


   static final void a(int var0, int var1, boolean var2, int var3, int var4, int var5, int var6, int var7) {
      ++a;
      Object[] var11 = null;

      ew var8;
      ew var9;
      for(Object[] var12 = (var8 = (ew)dda.a(rga.f, 2)) != null?var8.k:null; var12 != null; var12 = (var9 = (ew)client.a(rga.f, -28280)) != null?var9.k:null) {
         if(var3 == ((int[])((int[])var12[1]))[3] && ~var4 == ~((int[])((int[])var12[1]))[5] && ((int[])((int[])var12[1]))[0] == var7 && ((int[])((int[])var12[1]))[9] == var5) {
            var11 = var12;
            break;
         }
      }

      if(var11 == null) {
         var11 = ec.a(new Object[4], (byte)-112);
         ((int[])((int[])var11[1]))[3] = var3;
         ((int[])((int[])var11[1]))[5] = var4;
         ((int[])((int[])var11[1]))[9] = var5;
         ((int[])((int[])var11[1]))[0] = var7;
         if(var4 >= 0 && var7 >= 0 && rp.c > var4 && var7 < wpa.a) {
            ena.a(var11, 120);
         }

         client.a(116, rga.f, (lm)(null == var11?null:var11[2]));
      }

      ((boolean[])((boolean[])var11[3]))[1] = false;
      ((boolean[])((boolean[])var11[3]))[0] = var2;
      ((int[])((int[])var11[1]))[1] = var0;
      ((int[])((int[])var11[1]))[8] = var6;
      ((int[])((int[])var11[1]))[6] = var1;
   }

   static final void a(int var0) {
      ++c;
      if(-1 != ((int[])((int[])Class_m.a[1]))[0]) {
         hj.a(((int[])((int[])Class_m.a[1]))[0], 3, (String)Class_m.a[0]);
      }

      if(var0 > -50) {
         a(((int[])((int[])f[5]))[0]);
      }

   }

   static final void b(Object[] var0, int var1) {
      IDirect3DIndexBuffer.Unlock(((long[])((long[])var0[6]))[var1]);
      ++g;
   }

   static final void a(Object[] var0, int var1) {
      ++b;
      if(null != ((ta)var0[38]).E) {
         int var2 = ((ta)var0[38]).E.e();
         int var3 = ((ta)var0[38]).E.d();
         if(var2 > 0 || 0 < var3) {
            int var4 = ((int[])((int[])var0[1]))[25];
            int var5 = ((int[])((int[])var0[1]))[21];
            if(var1 < -91) {
               int var6 = ((int[])((int[])var0[1]))[20];
               int var7 = ((int[])((int[])var0[1]))[30];
               ag.b(-7145, var0);
               int var8 = ((int[])((int[])var0[1]))[16];
               int var9 = ((int[])((int[])var0[1]))[2];
               int var10 = ((int[])((int[])var0[1]))[1];
               int var11 = ((int[])((int[])var0[1]))[26];
               loa.a((byte)-47, var0);
               OpenGL.glReadBuffer(1028);
               OpenGL.glDrawBuffer(1029);
               ef.a((byte)-102, var0);
               oh.a(false, var0, (byte)-40);
               jea.a(var0, (byte)93, false);
               am.a(false, (byte)119, var0);
               kh.a(false, (byte)-33, var0);
               ah.a(var0, (Object[])null, (byte)114);
               vha.a(-4, 1, var0);
               aqa.a(0, var0, 79);
               OpenGL.glMatrixMode(5889);
               OpenGL.glLoadIdentity();
               OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
               OpenGL.glMatrixMode(5888);
               OpenGL.glLoadIdentity();
               OpenGL.glRasterPos2i(0, 0);
               OpenGL.glCopyPixels(0, 0, var2, var3, 6144);
               OpenGL.glFlush();
               OpenGL.glReadBuffer(1029);
               OpenGL.glDrawBuffer(1029);
               dfa.a(var8, -104, var10, var9, var0, var11);
               if(var0 != null && var0.length == 1 && var0[0].equals(Integer.valueOf(1)) && var0[0].equals(Integer.valueOf(0))) {
                  mga.a(114, true, new Object[25][], (Object[])null, (byte[])null, 74, 0, -21);
               }

               dd.a(var4, var7, (byte)123, var6, var5, var0);
            }
         }
      }
   }

   static final int a(byte var0, int var1, Object[] var2, int var3) {
      ++e;
      if(var2[5] != null) {
         if(var0 != -28) {
            a(((byte[])((byte[])var2[9]))[19], 1, (Object[])null, ((int[])((int[])var2[0]))[2]);
         }

         ma var4;
         Object[] var5 = (var4 = (ma)pm.a((long)var3, (Object[])((Object[])var2[5]), false)) == null?null:var4.s;
         return var5 != null?((int[])((int[])var5[1]))[0]:var1;
      } else {
         return var1;
      }
   }

}
