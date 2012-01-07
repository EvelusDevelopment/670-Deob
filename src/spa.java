import java.io.IOException;

final class spa extends IOException {

   static float c;
   static int b;
   static int a;
   static int d;
   static int e;


   static final void a(Object[] var0, int var1, Object[] var2, byte var3) {
      int var4 = 76 % ((-28 - var3) / 40);
      ++b;
      moa.a((byte)99, var2, (Object[])((Object[])var0[0]));
      za.a(var1, -20929, (Object[])((Object[])var0[0]));
   }

   static final void a(int var0, int var1, Object[] var2, Object[] var3) {
      if(1 == var0) {
         ((int[])((int[])var2[1]))[4] = de.a((int)0, var3);
      } else if(var0 == 2) {
         fh.a(var3, false);
      } else if(var0 == 3) {
         ((int[])((int[])var2[1]))[6] = lr.a(1, var3);
         ((int[])((int[])var2[1]))[8] = lr.a(1, var3);
         ((int[])((int[])var2[1]))[10] = lr.a(1, var3);
      } else if(4 != var0) {
         if(6 == var0) {
            ((int[])((int[])var2[1]))[3] = fh.a(var3, false);
         } else if(8 == var0) {
            ((int[])((int[])var2[1]))[2] = 1;
         } else if(var0 != 9) {
            if(10 == var0) {
               ((boolean[])((boolean[])var2[0]))[0] = true;
            }
         } else {
            ((int[])((int[])var2[1]))[9] = 1;
         }
      } else {
         ((int[])((int[])var2[1]))[5] = fh.a(var3, false);
         ((int[])((int[])var2[1]))[7] = lr.a(1, var3);
      }

      ++a;
      if(var1 >= -58) {
         a(-94, (byte)48);
      }

   }

   static final void a(byte var0) {
      ++e;
      br.e.p(gm.a, -2 != ~Class_ss.b((Object[])((Object[])tu.d[38]), 0)?-1:256 + ija.b << 2, 0);
      if(var0 > -6) {
         a(26, -87, new Object[3], (Object[])null);
      }

   }

   spa(String var1) {
      super(var1);
   }

   static final short a(int var0, byte var1) {
      ++d;
      int var2 = var0 >> 10 & 63;
      int var3 = 112 & var0 >> 3;
      int var4 = var0 & 127;
      var3 = var4 > 64?var3 * (-var4 + 127) >> 7:var4 * var3 >> 7;
      int var5 = var4 + var3;
      int var6;
      if(0 == var5) {
         var6 = var3 << 1;
      } else {
         var6 = (var3 << 8) / var5;
      }

      return var1 != 68?119:(short)(var5 | var6 >> 4 << 7 | var2 << 10);
   }

}
