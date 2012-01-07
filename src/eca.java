import jagdx.IDirect3DTexture;

final class eca {

   static int f;
   static int a;
   static int h;
   static int e;
   static Object[] g = ed.a(6, new Object[1], (byte)-114, 9);
   static String[] c = new String[100];
   static int d;
   static int b;


   static final int a(int var0, Object[] var1) {
      if(var0 >= -24) {
         return -52;
      } else {
         ++e;
         return 0;
      }
   }

   static final int a(Object[] var0, String var1, int var2) {
      ++h;
      if(var2 != 0) {
         ((boolean[])((boolean[])((Object[])((Object[])g[3]))[0]))[1] = true;
      }

      if(ev.a((int)4120, var0)) {
         var1 = var1.toLowerCase();
         int var3 = pe.a((Object[])((Object[])((Object[])((Object[])var0[3]))[4]), false, hp.a(var1, (int)1));
         return kja.a(var3, -124, var0);
      } else {
         return 0;
      }
   }

   static final void a(int var0, Object[] var1, int var2) {
      ++a;
      if(null != var1 && 87 == var1.length) {
         pa.a(var1, true, var0);
      } else {
         if(var2 != 87) {
            a((Object[])((Object[])g[6]), 63);
         }

         if(var1 != null && var1.length == 91) {
            sh.a(var0, var1, false);
         } else {
            throw new IllegalStateException();
         }
      }
   }

   static final void a(Object[] var0, int var1, Object[] var2) {
      ++f;
      if(var0 != null && -88 == ~var0.length) {
         vha.a(var0, var2, false);
      } else {
         if(var1 != 24394) {
            c = (String[])((String[])((Object[])((Object[])g[3]))[4]);
         }

         if(null != var0 && -92 == ~var0.length) {
            rka.a(-24805, var0, var2);
         } else {
            throw new IllegalStateException();
         }
      }
   }

   static final kha a(Object[] var0, int var1) {
      int var2 = 30 / ((var1 + 45) / 45);
      ++d;
      return new kha(var0);
   }

   static final long b(Object[] var0, int var1) {
      if(var1 != -23950) {
         a((Object[])null, ((int[])((int[])((Object[])((Object[])g[2]))[2]))[34]);
      }

      ++b;
      if(~((long[])((long[])var0[3]))[0] == -1L) {
         ((long[])((long[])var0[3]))[0] = IDirect3DTexture.GetSurfaceLevel(((long[])((long[])((Object[])((Object[])var0[2]))[2]))[0], ((int[])((int[])var0[1]))[0]);
      }

      return ((long[])((long[])var0[3]))[0];
   }

}
