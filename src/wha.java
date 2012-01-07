import java.util.Random;

final class wha {

   static int f_l;
   static int k;
   static int h;
   static int d;
   static int c;
   private Object[] m;
   static int f_i;
   static int b;
   static int j = 0;
   static int a;
   static int g;
   static Random e = new Random();
   static int f;


   static final void a(Object[] var0, Object[] var1, int var2, int var3) {
      if(var3 >= -61) {
         a((Object[])((Object[])var0[2]), (Object[])null, ((int[])((int[])var0[1]))[3], 61);
      }

      if(var2 != 1) {
         if(var2 == 2) {
            ((int[])((int[])var0[1]))[0] = 0;
         }
      } else {
         ((char[])((char[])var0[0]))[0] = kf.a(true, ipa.a(var1, (int)-81));
      }

      ++c;
   }

   static final Object[] a(Object[] var0, byte var1) {
      ++h;
      nca.a(var0, 18);
      return var1 != -119?(Object[])null:var0;
   }

   static final void a(String var0, int var1, Object[] var2) {
      ++b;
      var2[5] = var0;
      if(var2[var1] == null) {
         var2[6] = null;
      } else {
         if(var2[6] != null) {
            String var5 = (String)var2[5];
            Object[] var7 = (Object[])((Object[])var2[6]);
            String var6 = (String)var7[6];
            if(!var5.equals(var6)) {
               var2[6] = null;
            }
         }

         if(var2[6] == null) {
            if(var2 != null && var2.length == 11) {
               eh.a((Object[])null, -126, false);
            }

            Class_ls var3;
            Class_ls var4;
            for(Object[] var8 = null != (var3 = (Class_ls)qt.a(0, (Object[])((Object[])var2[4])))?var3.j:null; null != var8; var8 = (var4 = (Class_ls)nda.a(1, (Object[])((Object[])var2[4]))) == null?null:var4.j) {
               if(null != var8 && 7 == var8.length && ((String)var2[5]).equals(oh.a(1, var8))) {
                  var2[6] = var8;
                  return;
               }
            }
         }

      }
   }

   static final int a(int var0, Object[] var1) {
      ++f_l;
      if(var0 != 0) {
         a((Object[])((Object[])var1[4]), (byte)-31);
      }

      return ama.b((byte)-93, var1);
   }

   static final void a(Object[] var0, Object[] var1, byte var2) {
      if(var2 != -122) {
         a((Object[])((Object[])var1[0]), (byte)81);
      }

      ++f;
      ((boolean[])((boolean[])var0[8]))[3] = false;
      synchronized(var1[3]) {
         gt.a((Object[])((Object[])var1[3]), -122, (nj)(var0 == null?null:var0[0]));
         ++((int[])((int[])var1[1]))[0];
      }

      if(null != var1[2]) {
         synchronized(var1[2]) {
            var1[2].notify();
         }
      }

   }

   protected final void finalize() throws Throwable {
      oda.a(true, this.m);
      ++f_i;
   }

   final void a(int var1) throws Throwable {
      if(var1 < 81) {
         j = ((int[])((int[])this.m[7]))[0];
      }

      ++a;
      super.finalize();
   }

   static final void a(Object[] var0, boolean var1, Object[] var2) {
      ++g;
      Object[] var3 = ((Object[][])((Object[][])var0[0]))[((int[])((int[])var2[1]))[1]];
      ((byte[])((byte[])var3[0]))[0] = ((byte[])((byte[])var2[3]))[0];
      ((int[])((int[])var3[1]))[0] = ((int[])((int[])var2[1]))[0];
      if(var1) {
         a((Object[])((Object[])var2[0]), (Object[])((Object[])var0[5]), -23, -94);
      }

      var3[2] = var2[2];
   }

   static final boolean a(byte var0, int var1) {
      ++d;
      if(var0 >= -73) {
         a((String)null, -84, new Object[0]);
      }

      return var1 == 3 || 4 == var1;
   }

   static final boolean a(Object[] var0, int var1) {
      if(var1 != 2) {
         a((Object[])null, true, (Object[])null);
      }

      ++k;
      return true;
   }

   wha(Object[] var1) {
      this.m = var1;
   }

}
