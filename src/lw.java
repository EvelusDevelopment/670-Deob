import jagdx.IDirect3DVertexBuffer;
import jagdx.fna;
import java.awt.Component;

final class lw {

   static int b;
   static int h;
   static int e;
   static Object[] f_i = ed.a(-2, new Object[1], (byte)-119, 61);
   static int a;
   static Object[] d;
   static int g = 0;
   static int f;
   static int c = 0;


   static final boolean a(int var0, Object[] var1, int var2, int var3, long var4) {
      int var6 = -37 % ((6 - var0) / 42);
      ++h;
      return fna.a(IDirect3DVertexBuffer.Upload(((long[])((long[])var1[4]))[0], var2, var3, !((boolean[])((boolean[])var1[2]))[0]?0:8192, var4), (byte)-83);
   }

   static final Object[] a(int var0, int var1, int var2, int var3, int var4, int var5, int var6, Object[] var7, boolean var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15) {
      ++f;
      if(var7[2] == null) {
         var7[2] = new byte[2];
      }

      if(null == var7[1]) {
         var7[1] = new short[4];
      }

      var7[4] = new int[4];
      var7[0] = new int[4];
      ((byte[])((byte[])var7[2]))[0] = (byte)var11;
      ((byte[])((byte[])var7[2]))[1] = (byte)var10;
      var7[7] = new int[4];
      ((int[])((int[])var7[0]))[3] = var13;
      ((int[])((int[])var7[0]))[2] = var15;
      ((int[])((int[])var7[0]))[0] = var14;
      ((int[])((int[])var7[0]))[1] = var4;
      ((int[])((int[])var7[7]))[2] = var12;
      ((int[])((int[])var7[7]))[0] = var1;
      if(var8) {
         c = 49;
      }

      ((int[])((int[])var7[7]))[1] = var6;
      if(null != var7 && 3 == var7.length) {
         a(35, 110, -81, 28, -104, -17, 86, (Object[])null, false, -84, 44, -66, 102, 110, -6, -128);
      }

      ((int[])((int[])var7[4]))[2] = var2;
      ((int[])((int[])var7[4]))[1] = var0;
      ((int[])((int[])var7[4]))[0] = var5;
      ((int[])((int[])var7[7]))[3] = var9;
      ((int[])((int[])var7[4]))[3] = var3;
      ((short[])((short[])var7[1]))[2] = (short)(var14 >> qqa.e);
      ((short[])((short[])var7[1]))[3] = (short)(var15 >> qqa.e);
      ((short[])((short[])var7[1]))[0] = (short)(var5 >> qqa.e);
      var7[5] = new short[4];
      ((short[])((short[])var7[1]))[1] = (short)(var2 >> qqa.e);
      var7[6] = new short[4];
      var7[3] = new short[4];
      return var7;
   }

   static final Object[] a(int var0, Object[] var1, Object[] var2) {
      ++e;
      if(var0 != 29929) {
         return (Object[])null;
      } else {
         var2[2] = var1;
         if(null == var2[3]) {
            var2[3] = new boolean[1];
         }

         if(var2[1] == null) {
            var2[1] = new byte[4];
         }

         ln.a(var0 ^ -1097, var2);
         return var2;
      }
   }

   static final rp a(boolean var0, Component var1, int var2) {
      ++b;
      return (rp)(var2 != -32260?(rp)null:new rr(var1, var0));
   }

   static final void a(byte var0) {
      ih.a(tu.d, (Object[])((Object[])tu.d[2]), 1, -101);
      ++a;
      ih.a(tu.d, (Object[])((Object[])tu.d[14]), 1, -115);
      ih.a(tu.d, (Object[])((Object[])tu.d[11]), 2, -110);
      ih.a(tu.d, (Object[])((Object[])tu.d[7]), 2, -89);
      ih.a(tu.d, (Object[])((Object[])tu.d[36]), 1, -123);
      ih.a(tu.d, (Object[])((Object[])tu.d[3]), 1, -68);
      ih.a(tu.d, (Object[])((Object[])tu.d[29]), 1, -117);
      ih.a(tu.d, (Object[])((Object[])tu.d[41]), 1, -54);
      ih.a(tu.d, (Object[])((Object[])tu.d[10]), 1, -90);
      ih.a(tu.d, (Object[])((Object[])tu.d[24]), 1, -64);
      ih.a(tu.d, (Object[])((Object[])tu.d[13]), 2, -49);
      ih.a(tu.d, (Object[])((Object[])tu.d[6]), 1, -41);
      ih.a(tu.d, (Object[])((Object[])tu.d[25]), 2, -110);
      ih.a(tu.d, (Object[])((Object[])tu.d[38]), 1, -39);
      ih.a(tu.d, (Object[])((Object[])tu.d[16]), 0, -69);
      ih.a(tu.d, (Object[])((Object[])tu.d[37]), 0, -127);
      ih.a(tu.d, (Object[])((Object[])tu.d[17]), 2, -42);
      ih.a(tu.d, (Object[])((Object[])tu.d[19]), 0, -106);
      ih.a(tu.d, (Object[])((Object[])tu.d[9]), 0, -94);
      ih.a(tu.d, (Object[])((Object[])tu.d[1]), 1, -111);
      fd.a(92);
      if(var0 >= 122) {
         ih.a(tu.d, (Object[])((Object[])tu.d[4]), 0, -113);
         ih.a(tu.d, (Object[])((Object[])tu.d[20]), 4, -104);
         iea.a((byte)39);
         tea.a((byte)-119);
         jea.c = true;
      }
   }

}
