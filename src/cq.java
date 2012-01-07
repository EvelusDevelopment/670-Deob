import java.io.IOException;
import java.lang.ref.SoftReference;
import java.net.Socket;

abstract class cq {

   static int e;
   static Object[] f_i;
   static boolean h = true;
   static int a;
   static int c;
   static int b;
   static int g;
   static int f;
   static int d;


   abstract int b(byte var1, long var2);

   static final void a(byte var0, float var1, float var2, float var3, Object[] var4) {
      ((float[])((float[])var4[0]))[1] += var2;
      ((float[])((float[])var4[0]))[8] += var1;
      if(var0 == 81) {
         ((float[])((float[])var4[0]))[7] += var3;
         ++b;
      }
   }

   static final boolean a(int var0, int[] var1, boolean var2, int var3, Object[] var4) {
      ++f;
      if(!var2) {
         a((byte)70, ((float[])((float[])((Object[])((Object[])var4[0]))[1]))[8], -0.90365773F, -0.55602956F, (Object[])null);
      }

      wr var5;
      wr var6;
      for(Object[] var7 = null != (var5 = (wr)dda.a((Object[])((Object[])var4[3]), 2))?var5.f_l:null; null != var7; var7 = (var6 = (wr)client.a((Object[])((Object[])var4[3]), -28280)) != null?var6.f_l:null) {
         if(jp.a(-6, var3, var7, var0)) {
            bs.a(var0, (byte)33, var3, var7, var1);
            return true;
         }
      }

      return false;
   }

   static final Object a(byte var0, Object[] var1) {
      if(var0 != 81) {
         return var1[1];
      } else {
         ++a;
         if(var1 != null && -4 == ~var1.length) {
            Object var2 = ((SoftReference)var1[2]).get();
            return var2;
         } else if(var1 != null && var1.length == 4) {
            return fla.a(var1, 2);
         } else {
            throw new IllegalStateException();
         }
      }
   }

   abstract void a(byte var1);

   final int a(byte var1, long var2) {
      int var4 = 101 % ((2 - var1) / 54);
      ++g;
      long var5 = this.b(-114);
      if(-1L > ~var5) {
         qs.a(var5, 81);
      }

      return this.b((byte)124, var2);
   }

   static final void a(int var0, byte var1, long var2, int var4) {
      ++d;
      int var6 = 16 / ((var1 - 13) / 60);
      int var5 = ((int)var2 & 510614) >> 14;
      int var7 = (3753762 & (int)var2) >> 20;
      int var8 = Integer.MAX_VALUE & (int)(var2 >>> 32);
      if(10 != var5 && 11 != var5 && var5 != 22) {
         mw.a(0, var5, true, true, var7, 0, var4, 0, var0);
      } else {
         Object[] var9 = mca.a(true, var8, lja.d);
         int var10;
         int var11;
         if(var7 != 0 && 2 != var7) {
            var10 = ((int[])((int[])var9[1]))[10];
            var11 = ((int[])((int[])var9[1]))[28];
         } else {
            var10 = ((int[])((int[])var9[1]))[28];
            var11 = ((int[])((int[])var9[1]))[10];
         }

         int var12 = ((int[])((int[])var9[1]))[24];
         if(var7 != 0) {
            var12 = (15 & var12 << var7) + (var12 >> 4 + -var7);
         }

         mw.a(var11, 0, true, true, 0, var12, var4, var10, var0);
      }

   }

   abstract long b(int var1);

   abstract long a(int var1);

   static final Object[] createSocketWorker(Socket socket, int size) throws IOException {
     ++c;
     return ib.createSocketWorker(socket, size);
   }
}
