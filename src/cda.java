import java.io.IOException;

final class cda {

   static int g;
   static int d;
   static Object[] b = ed.a(3, new Object[1], (byte)-98, 50);
   static Object[] e;
   static int c;
   static Object[] a = ho.a(3, 9, new Object[1], true);
   static int f = 0;


   static final Object[] a(int var0, Object[] var1, Object[] var2) {
      ++c;
      io.a(var1, false);
      byte[] var3 = fd.a(var0 ^ -9, 7, var2);
      Object[] var4 = jta.a((byte)-88, var3, new Object[3]);
      if(var0 != 9) {
         e = (Object[])((Object[])((Object[])((Object[])((Object[])((Object[])e[2]))[12]))[26]);
      }

      while(true) {
         int var5 = fh.a(var4, false);
         if(0 == var5) {
            return var1 != null && (var1.length == 3 || var1.length == 14 && var1[13].equals(Integer.valueOf(1)))?null:var1;
         }

         if(1 == var5) {
            var1[4] = ada.a(var4, (byte)-48);
         } else if(2 != var5) {
            if(var5 == 3) {
               var1[6] = ada.a(var4, (byte)-62);
            } else if(var5 == 4) {
               var1[1] = ada.a(var4, (byte)-128);
            } else if(var5 == 5) {
               var1[2] = hj.a(var4, (byte)-119);
            } else if(var5 != 6) {
               if(7 == var5) {
                  var1[5] = hj.a(var4, (byte)-47);
               } else if(8 != var5) {
                  if(9 != var5) {
                     if(var5 != 10) {
                        if(11 == var5) {
                           ((boolean[])((boolean[])var1[7]))[0] = true;
                        }
                     } else {
                        ada.a(var4, (byte)-76);
                     }
                  } else {
                     ada.a(var4, (byte)-52);
                  }
               } else {
                  ada.a(var4, (byte)-18);
               }
            } else {
               var1[3] = hj.a(var4, (byte)113);
            }
         } else {
            var1[0] = ada.a(var4, (byte)-73);
         }
      }
   }

   static final void a(int var0, Object[] var1) throws IOException {
      ++d;
      qs.a(var1, (int)10);
      if(var0 != 1) {
         e = (Object[])null;
      }

      it.a((Object[])((Object[])var1[2]), false);
   }

   static final void a(byte var0) {
      ++g;
      if(var0 == 89) {
         sf.b(var0 - 89);
         mka.e = false;
      }
   }

}
